class Hello 
{
	public static void main(String[] args) 
	{
		GoodsDAO gDao=new GoodsDAO();
		gDao.insert();
		gDao.update();


		DeptDAO dDao=new DeptDAO();
		dDao.insert();

		MemberDAO mDao = new MemberDAO();
		mDao.insert();

	}
}
