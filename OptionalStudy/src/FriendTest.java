import java.util.Optional;

public class FriendTest {
    public static void main(String[] args) {

    }
    public static void showCompAddr(Optional<Friend> f){
        String addr = f.map(friend -> friend.getCompany()) // Optional<Company>
                            .map(company -> company.getContInfo()) // Optional<ContInfo>
                            .map(cont -> cont.getAddr()) // Optional<String>
                            .orElse("주소 정보가 없습니다00.");

        System.out.println(addr);
    }

    public static void showCompanyAddr(Friend f){
        // 매개변수로 전달된 친구가 다니는 회사의 주소 정보 출력
        //System.out.println(f.getCompany().getContInfo().getAddr()); ▶ null 체크가 되어 있지 않음.

        String addr = null;

        if (f != null){
            Company company = f.getCompany();
            if (company != null){
                ContInfo contInfo = company.getContInfo();
                if (contInfo != null){
                    addr = contInfo.getAddr();
                }
            }
        }
        if (addr != null){
            System.out.println(addr);
        }
        else {
            System.out.println("연락처 정보가 없습니다.");
        }


    }

}
