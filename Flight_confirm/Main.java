import java.util.HashMap;//優劣なし、重複NG
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	//【インスタンス作成】
    	//フライト情報を格納するMap教科書ｐ６０３
    	//Map＝インターフェース→HashMapインターフェース実装（クラス）
        Map<String,Flight> flights = new HashMap<String,Flight>();
        //格納データ
    	flights.put("JL123",new Flight("JL123","東京","北海道"));
    	flights.put("JL456",new Flight("JL456","北海道","東京"));
    	
        //【ユーザ入力を受付】
    	//大文字強制変換APIを使用＝.toUpperCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("便名を入力してください>");
        String code = sc.nextLine().toUpperCase();
        
        //【受け付けたcode】→を【仮引数】にする
        Flight f = flights.get(code);
        	
        //【例外処理】コードがデータベースになかったらエラー文出すif-else
        if ( f != null) {
        	System.out.println("code:" +f.getfNum());
        	System.out.println("Departure:" +f.getDep());
        	System.out.println("Arrival:" +f.getArr());
        }else {
        	System.out.println("その便はないかも・・・ \n他社かもしれないよ((+_+))");
        	
        sc.close();
        }
    }
}