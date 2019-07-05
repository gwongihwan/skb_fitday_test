# skb_fitday_test

- Lombok이 적용되어 있어 로컬 환경 IDE에 lombok 플러그인 설치 등의 선행작업이 필요함.
<br />
- Spring boot Profile로 실행 환경을 구별한다. (local, dev, prd)
<br />
- 생성한 Jar 파일을 이용하여 애플리케이션 실행은 아래와 같은 방법으로 한다.
<br/>
java -Dspring.profiles.active=prd -jar Application_name.jar