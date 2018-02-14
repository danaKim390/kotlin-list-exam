# 코틀린 기본 문법

## 궁금한 키워드
### internal

## 데이터 클래스 만들때 
보안상 hashCode, equals 꼭 필요하다 
class앞에 data키워드 적어주면 된다 

### //TODO @param: ColorRes @field:ColorRes 이 두개는 뭐지?
- Annotation 
: 코드에 메타 데이터를 추가하여 제약 사항을 넣거나 컴파일 단계에서 별도의 코드를 생성하는 등 다양한 작업을 수행할 수 있다
- 코드에 메타데이터를 붙인 다는 것 

#### 사용 방법
@키워드:Annotation

#### Target
주석으로 될 수 있는 element지정 
#### param
생성자의 파라미터 
#### field 
프로퍼티로 생성되는 field 이게 무슨 말입니까 property? 
#### delegate
위임 프로퍼티를 위한 위임 인스턴스를 보관한 필드 
#### file 
top-level function이나 property를 가진 class, package선언 이전에 선언되어야 한다 
예를 들면 
#### get
 프로퍼티의 getter
#### set
 프로퍼티의 setter
#### property 
이 대상을 갖는 Annotation은 Java에는 보이지 않는다 
#### receiver 
확장 함수나 프로퍼티의 리시버 파라미터 
#### setparam 
프로퍼티의 setter 파라미터 


### layout key가져올때 find할 필요 없이 extention으로 바로 가져온다 

### HashMap 
- Java
```java
HashMap<Sting, Value> map = new HashMap<>;
map.put ...
```
- Kotlin
```kotlin
 mapOf() 
```




### get, set 줄여서 사용 
