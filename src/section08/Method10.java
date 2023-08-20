package section08;

public class Method10 {

    public static void main(String[] args) {

        MemberVO memberVO = new MemberVO();

        memberVO.setId("abc");
        memberVO.setPwd("abc123!@#");
        memberVO.setName("홍길동");
        memberVO.setAge(26);
        memberVO.setMobile("01028883443");


        System.out.println(memberVO.getId());
        System.out.println(memberVO.getPwd());
        System.out.println(memberVO.getName());
        System.out.println(memberVO.getAge());
        System.out.println(memberVO.getMobile());

    }
}
