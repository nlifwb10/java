# java

<br>

### git에 새로운 반영사항이 있을 때, 로컬에 있는 프로젝트와 버전 맞추는 방법
1. `git bash`
2. `git remote update`
    - https://github.com/nlifwb10/java 의 최신 상태를 로컬 저장소에 업데이트한다.
    - commit id로 반영될 코드를 확인할 수 있다.
<img width="1112" alt="remoteUpdate" src="https://user-images.githubusercontent.com/35926413/101282244-510ad600-3817-11eb-9e25-234eba51fc7d.png">
3. `git pull origin {master}`  
    - repository의 최근 반영 사항을 내 코드에 merge해서 받는다.
    - {}는 브랜치 이름을 뜻한다.
    - 보통 repository를 생성하면 master 또는 main 으로 default가 잡힌다.
<img width="1108" alt="pulloriginmaster" src="https://user-images.githubusercontent.com/35926413/101282246-536d3000-3817-11eb-83fd-f9a527ab6318.png">
4. 반영사항 체크
<img width="962" alt="chk" src="https://user-images.githubusercontent.com/35926413/101282247-5536f380-3817-11eb-94e3-99920ae183c7.png">


### 위의 방법으로 되지 않을 경우
1. 마지막 커밋후 띄어쓰기 등 어떠한 변경된 사항이 있어서 commit을 해야 하는 경우
2. pull을 땡겼는데 repository에 있는 코드와 내 코드가 충돌 날 경우
    - 이 경우는 git bash 와 같은 터미널로 해결하기 불편하다.
    - ui가 제공되는 github desktop, eclipse 등으로 해결한다.

