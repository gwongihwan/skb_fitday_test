package com.skb.fitday.springboot.api;

import com.skb.fitday.springboot.model.ApiResponseMessage;
import com.skb.fitday.springboot.model.request.RequestBodyVo;
import com.skb.fitday.springboot.model.response.ResponseBodyVo;
import com.skb.fitday.springboot.model.response.ResponseDataVo;
import com.skb.fitday.springboot.model.response.ResponseDirectivesVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/fitday")
@Slf4j
public class NuguController {
    /*
     *Logger 객체 생성은 위의 롬복Slf4j 애노테이션으로 생략됨. 멤버변수 log.debug() 형태로 사용.
     */

    @PostMapping("/**")
    public ResponseEntity<ResponseBodyVo> request(@RequestBody @Valid RequestBodyVo reqVo) {
//    public ResponseEntity<ApiResponseMessage> request(@RequestBody String req) {
        log.debug("all request");

//        JSONObject json = new JSONObject(req);
//        log.debug(json.toString());

        this.getLogRequestObject(reqVo);

        return new ResponseEntity<ResponseBodyVo>(this.getResponseObject(reqVo), HttpStatus.OK);
    }

    @NotNull
    private void getLogRequestObject(RequestBodyVo reqVo) {
        log.debug("version : " + reqVo.getVersion());

        //// action
        log.debug("action.actionName : " + reqVo.getAction().getActionName());
//        log.debug("parameters size : " + reqVo.getAction().getParameters().size());
        Set keys = reqVo.getAction().getParameters().keySet();
        Iterator iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next().toString();
            Map<String, String> obj = reqVo.getAction().getParameters().get(key);
            log.debug("action.parameters." + key + " > type : " + obj.get("type"));
            log.debug("action.parameters." + key + " > value : " + obj.get("value"));
        }

        //// context
        log.debug("context.text : " + reqVo.getContext().getText());

        log.debug("context.device.type : " + reqVo.getContext().getDevice().getType());
        Set keys2 = reqVo.getContext().getDevice().getState().keySet();
        Iterator iter2 = keys2.iterator();
        while (iter2.hasNext()) {
            String key = iter2.next().toString();
            log.debug("context.device.state." + key + " : " + reqVo.getContext().getDevice().getState().get(key));
        }

        log.debug("context.supportedInterfaces.Delegation.playServiceId : "
                + reqVo.getContext().getSupportedInterfaces().getDelegation().getPlayServiceId());
        Set keys3 = reqVo.getContext().getSupportedInterfaces().getDelegation().getData().keySet();
        Iterator iter3 = keys3.iterator();
        while (iter3.hasNext()) {
            String key = iter3.next().toString();
            log.debug("context.supportedInterfaces.Delegation.data." + key + " : "
                    + reqVo.getContext().getSupportedInterfaces().getDelegation().getData().get(key));
        }

        //// session
        log.debug("context.session.id : " + reqVo.getContext().getSession().getId());
        log.debug("context.session.isNew : " + reqVo.getContext().getSession().isNew());
//        log.debug("context.session.isNew : " + reqVo.getContext().getSession().getIsNew());
        log.debug("context.session.accessToken : " + reqVo.getContext().getSession().getAccessToken());
        log.debug("context.session.playBuilderRequest : " + reqVo.getContext().getSession().isPlayBuilderRequest());
//        log.debug("context.session.playBuilderRequest : " + reqVo.getContext().getSession().getPlayBuilderRequest());
    }

    private ResponseBodyVo getResponseObject(RequestBodyVo reqVo) {
        ResponseBodyVo resVo = new ResponseBodyVo();

        //// version 셋팅
        resVo.setVersion(reqVo.getVersion());

        //// resultCode 셋팅
        // 처리에 따라 resultCode 값 OK에서 변경

        //// output JSON 셋팅
        Map<String, String> resOutputMap = new HashMap<String, String>();
        Map<String, Map<String, String>> reqParams = reqVo.getAction().getParameters();
        Set reqParamKeys = reqParams.keySet();
        Iterator keyIter = reqParamKeys.iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next().toString();
            String value = reqParams.get(key).get("value");

            resOutputMap.put(key, value);
        }
        resVo.setOutput(resOutputMap);

        //// directives 셋팅
        Map<String, String> reqDataMap = reqVo.getContext().getSupportedInterfaces().getDelegation().getData();
        String reqSceneId = reqDataMap.get("scene_id");
        String reqAppId = reqDataMap.get("app_id");

        ResponseDirectivesVo directivesVo = new ResponseDirectivesVo();
        ResponseDataVo resDataVo = new ResponseDataVo();
        resDataVo.setSceneId(reqSceneId);
        resDataVo.setCtrlType("CTRL_TYPE");
        resDataVo.setCtrlValue("CTRL_VALUE");

        Map<String, Object> analMap = new HashMap<>();
        analMap.put("code", 0);
        analMap.put("normalizedUtterance", "노멀");
        analMap.put("originalUtterance", "오리지날");
        resDataVo.setAnalysis(analMap);

        directivesVo.setData(resDataVo);

        directivesVo.setAppId(reqAppId);

        ResponseDirectivesVo[] resDirectivesArr = {directivesVo};

        resVo.setDirectives(resDirectivesArr);

        return resVo;
    }

}
