<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list students as student>
        <li>${student.id} - ${student.firstName} ${student.lastName} ${student.class} </li>
    </#list>
</ul>

</body>

</html>
