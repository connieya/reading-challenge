<%
    final String aValue = "abcde";
    for (int outLoop =0; outLoop <10; outLoop++) {
        String a= new String();
        StringBuffer b= new StringBuffer();
        StringBuilder c = new StringBuilder();

        for (int loop = 0; loop < 10000; loop++) {
            a+=aValue;
        }
        for (int loop = 0; loop < 10000; loop++) {
            b.append(aValue);
        }
        for (int loop = 0; loop < 10000; loop++) {
            c.append(aValue);
        }
        String temp2 = c.toString();

    }
%>
ok
<%=
   System.currentTimeMillis()
%>