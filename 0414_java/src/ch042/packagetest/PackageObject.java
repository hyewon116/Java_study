package ch042.packagetest;
/*
 * package : 현재의 ~.java 파일의 컴파일된 결과(~.class 파일)의 위치를 지정.
 * - 상위 폴더에서 하위 폴더 순으로 표현(선언)
 * - 상위 폴더에서 하위 폴더 순으로 .(dot)를 통해 폴더를 구분.
 * - .(dot) : '~의 내부'를 지칭 : ex) a.b -> a 안에 b 있다. 
 * - 하나의 ~.java 파일의 안에는 하나의 package만 온다.
 * - 자바에서 폴더는 소문자 선호 
 * - compile : javac -d . PackageObject.java 
 *   -> PackageObject.class 파일을 ch042 폴더 내부의 packagetest 폴더에 넣어라.
 *   -> (위에 1라인 참고 : package ch042.packagetest;)
 *   
 */

public class PackageObject {
	
	public String packageNo;
	public String packageName;
	
	public void chkPackage() {
		System.out.println(packageNo + " : " + packageName);
	}
	
}//class
