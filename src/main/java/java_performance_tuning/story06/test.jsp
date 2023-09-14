<%@ page import="java.util.*" %>
<%!
    static ArrayList list = new ArrayList();
    static StringBuilder dummyStr;
    static {
        dummyStr = new StringBuilder("1234567890");
        for (int loop=0; loop <22; loop++) {
            dummyStr.append(dummyStr);
        }
    }
%>
<%
    list.add(dummyStr.toString());
%>
<%= list.size()+" "+dummyStr.length()%>