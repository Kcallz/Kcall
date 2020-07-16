import java.util.List;

public class TestDao extends BaseDao<Test01>{
	
	public List<Test01> selectAll(){
		return this.executeQuery("select * from student", Test01.class);
	}
	
	public Test01 selectBySno(String sno) {
		List<Test01> list = this.executeQuery("select * from student where sno=?",Test01.class, sno);
		return list.get(0);
	}
	
	public void addone(Test01 t) {
		String sql = "insert into student values(?,?,?,?,?)";
		this.executeUpdate(sql,t.getSno(),t.getSname(),t.getSsex(),
				t.getSbir(),t.getScredits());
	}
	
	public void update(Test01 t) {
		String sql = "update student set sname=?,ssex=?,sbir=?,scredits=? where sno=?";
		this.executeUpdate(sql, t.getSname(),t.getSsex(),
				(java.sql.Date)t.getSbir(),t.getScredits(),t.getSno());
	}
	
	public void delBySno(String sno) {
		String sql = "delete from student where sno=?";
		this.executeUpdate(sql, sno);
	}
	public static void main(String[] args) {
		TestDao td = new TestDao();
		//System.out.println(td.selectAll().size());
		//System.out.println(td.selectBySno("18042106"));
		//Test01 t = new Test01("00000001","hzl","ÄÐ",null,10);
		//td.addone(t);
		//t.setSsex("Å®");
		//t.setScredits(100);
		//td.update(t);
		td.delBySno("00000001");
		System.out.println(td.selectAll().size());
	}
}

