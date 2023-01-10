## Dev env

### Frontend

- React 17.0.2
  - NodeJS 16.16.0

### Backend

- SpringBoot 3.0.1
- jdk 11
- mysql  8.0.29

### External Libraries
- Docker 20.10.16
- Nginx stable-alpine
- Jenkins 2.375.1

## System Arcitecture

![image-20230108225249049](https://user-images.githubusercontent.com/82326116/211546886-b386f4d2-0cba-4ae0-93f0-803a78433c96.png)



- 깃랩, jenkins, docker를 활용하여 cicd

- letsencryptf로 ssl 인증서 후 https 설정합니다.
- nginx로 멀티 도메인 설정합니다.
  - 고객사별로 다른 도메인으로 접근할 수 있습니다.
- 서류 지원 및 합격자 발표 등 순간적인 대용량 트래픽 예상하여 오토스케일링 설정합니다.

- 컨테이너화를 최대한 활용하여 아키텍처를 구성합니다.
- Mail과 SMS는 백엔드에서 작동합니다.

## Port

포트 설정은 다음과 같습니다.

- 백엔드 서버 8080

- 관리자 페이지 8081

- 서비스 페이지 8082

- 젠킨스 관리 페이지 9090

  
