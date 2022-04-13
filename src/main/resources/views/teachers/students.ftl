<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list students as student>
        <li>${student.id} - ${student.firstName} ${student.lastName} ${student.classroom} </li>
    </#list>
</ul>

<form action="/students" method="delete" class="form-example">
        <div class="form-example">
            <label for="id">Entrez ID eleve à supprimer: </label>
            <input type="text" name="id" id="id" required>
        </div>
        <div class="form-example">
            <input type="submit" value="envoyer">
        </div>
</form>

</body>

</html>
