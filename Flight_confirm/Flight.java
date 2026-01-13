public class Flight {
	
	//カプセル化した【フィールド】
	private String fNum;
	private String dep;
	private String arr;
	
	//【コンストラクタ作成】
	public Flight(String fNum,String dep,String arr) {
		this.fNum = fNum;
		this.dep = dep;
		this.arr = arr;
	}
	
	//【カプセル化】、fNum,dep,arr
	public String getfNum() {
		return fNum;
	}

	public String getDep() {
		return dep;
	}

	public String getArr() {
		return arr;
	}
}
