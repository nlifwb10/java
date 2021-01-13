# Chapter11

## Collection Framework 이란?
### 컬렉션
여러 객체 데이터를 모아 놓은 것을 의미 

### 프레임웍
- 라이브러리(기능) + 프로그래밍 방식 
- 표준화, 정형화된 체계적인 프로그래밍 방식 

### 컬렉션 프레임웍
- 컬렉션(다수의 객체)를 다루기 위한 표준화된 프로그래밍 방식 
- 컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스를 제공 
- java.util 패키지에 포함. JDK1.2부터 제공 

### 컬렉션 클래스 
댜수의 데이터를 저장할 수 있는 클래스(Vector, ArrayList, HashSet)  

<br>

## List 인터페이스 
- 순서O, 중복O

## Set 인터페이스
- 순서X, 중복X

## Map 인터페이스 
- 순서X, 중복(키 X, 값 O)

## 6.1 Array(2/3) 
배열을 다루기 위한 메서드(static) 제공
### 3. 배열의 복사 - copyOf(), copyOfRange()
#### copyOf(copyOfRange), System.arraycopy와 다른 점 
- System.arraycopy()는 이미 존재하는 두 배열을 복사
- copyOf(copyOfRange)는 배열의 복사 뿐만 아니라 생성도 진행 

### 5. 배열의 List로 반환
#### asList(Object... a)
- 배열을 리스트로 변환시켜주지만 읽기전용 리스트로 변환시킨다.
- 추가, 삭제가 불가능 하다.
```
List list = Arrays.asList(1,2,3,4,5); //list = [1,2,3,4,5];
list.add(6); //불가능 
```
- 추가, 삭제가 가능한 리스트로 변환시키고 싶을 경우 ArrayList, LinkedList를 사용한다.
```
List list = new ArrayList(Arrays.asList(1,2,3,4,5));
```

### 6. 배열의 정렬과 탐색 
#### sort()
#### binarySearch()
- binarySearch()를 사용하기 전에 배열이 정렬 되어 있어야 한다.

#### 순차검색과 이진검색
- 이진검색은 이분검색이라고도 하며 영어로는 binary search라고 한다.
- 순차검색 
	- 처음부터 순차적으로 검
- 이진검색
	- 범위를 절반을 나눠가며 검색(정렬 필수) 
	- 배열이 크고 정렬이 되어 있다면 이진검색이 효율적이고 빠르다 

## 6.2 Comparator와 Comparable 
- 객체를 정렬할 때 정렬기준이 필요하다.

#### Comparable
- 기본 정렬기준을 구현하는데 사용
- Integer, String, Date 등 클래스 내에 compareTo()로 정의되어 있는 정렬기준이 기본 정렬기준이라 한다.

#### Comparator
기본 정렬기준 외에 다른 기준으로 정렬하고할 때 사용

## 7.1 HashSet과 TreeSet
순서X, 중복X 

### HashSet
- Set인터페이스를 구현한 대표적인 컬렉션 클래스 
- 순서를 유지하려면, LinkedHashSet 클래스를 사용 
- Hashing 기법을 사용하기 때문에 붙여진 이름 
- 같은 객체가 없으면 저장(return true)하고 없으면 저장하지 않는다(return false)
- TreeMap을 이용해서 구현되어 있다 

### TreeSet
- 범위 검색과 정렬에 유리한 컬렉션 클래스 
- HashSet보다 데이터 추가, 삭제에 시간이 더 걸린다 
- 이진트리라고 하는 나무 구조로 되어있어서 붙여진 이름 
- TreeMap을 이용해서 구현되어 있다 



--

- 검색이라는 단어보다 탐색이라는 말로 표현하는 추세 
- 오토박싱이란 




