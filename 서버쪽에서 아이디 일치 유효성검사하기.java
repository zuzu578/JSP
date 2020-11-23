
String sql = "select count(*) cnt from signup where userid='' and password=''";

rs.next();
			int cnt=rs.getInt('cnt');
			if(cnt==0) {
				System.out.println("그런 회원이 없습니다.");
			}