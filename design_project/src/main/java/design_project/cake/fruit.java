/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 2022-06-03
 * 목적 : 팩토리에서 생성하는 재료 타입을 설정
 */
package design_project.cake;

public interface fruit {
    public String getName();    // cake에 값을 전달하기 위해서 toString 대신 getName을 사용하여 return을 통해 값을 반환
}