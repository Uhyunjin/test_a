class Hello 
{
	public static void main(String[] args) 
	{
		GoodsDAO gDao=new GoodsDAO();
		gDao.insert();
		gDao.update();

		MemberDAO mDao = new MemberDAO();
		mDao.insert();
	}
}
