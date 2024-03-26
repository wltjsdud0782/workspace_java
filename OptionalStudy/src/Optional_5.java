import java.util.Optional;

public class Optional_5 {
    public static void main(String[] args) {
        ContInfo c = new ContInfo("010-1234-5678", "울산");

        String tel = null;

        Optional<ContInfo> cBox = Optional.of(c);
        String r2 = cBox.map(contInfo -> contInfo.getTel()).orElse("연락처가 등록되어 있지 않습니다.");
        System.out.println(r2);



//        if (c.getTel() != null){
//            tel = c.getTel();
//        }
//        else{
//            tel = "연락처가 등록되어있지 않습니다.";
//        }
    }
}
