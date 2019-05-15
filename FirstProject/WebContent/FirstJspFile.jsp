<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP File</title>
</head>
<body>
<h1>Addition</h1>
<br>

<%! 
int fact = 1;
public int fact(int a){
	
	for(a=5;a>0;a--)
	{
		fact+= fact*a;
	}
	System.out.println(fact);
	return fact;
}
%>

<br>

The values of k are : 
<%

int k=0;
for(int i=0;i<5;i++)
{
	for(int j=1;j<6;j++)
	{
		k = i + j;
		//out.println("<br> k =  "+k);
	}
	out.println("<br> k = "+k);
}

%>
<br>

</body>
</html>