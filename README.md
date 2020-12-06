# java

<br>

### git에 새로운 반영사항이 있을 때, 로컬에 있는 프로젝트와 버전 맞추는 방법
1. git bash 
2. git remote update
  - https://github.com/nlifwb10/java 의 최신 코드를 체크한다
3. git pull origin {master}
  - repository의 최근 반영 사항을 내 코드에 merge해서 받는다.
  - {} 중괄호는 브랜치 이름을 뜻한다.
  - 보통 repository를 생성하면 master 또는 main 으로 default가 잡힌다.
  - 때문에 명령어 사용할 때는 중괄호를 작성하지 않는다.

### 위의 방법으로 되지 않을 경우
1. 마지막 커밋후 띄어쓰기 등 어떠한 변경된 사항이 있어서 commit을 해야 하는 경우
2. pull을 땡겼는데 repository에 있는 코드와 내 코드가 충돌 날 경우
  - 이 경우는 git bash 와 같은 터미널로 해결하기 불편하다.
  - ui가 제공되는 github desktop, eclipse 등으로 해결한다.

