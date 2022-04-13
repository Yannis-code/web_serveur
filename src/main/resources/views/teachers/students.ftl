<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list students as student>
        <li>${student.id} - ${student.firstName} ${student.lastName} ${student.classroom} </li>
    </#list>
</ul>

<h1>Créer un étudiant</h1>
<form action="/students" method="post" class="form-example">
    <div class="form-example">
        <label for="name">Entrez le prénom: </label>
        <input type="text" name="firstname" id="firstname" required>
    </div>
    <div class="form-example">
        <label for="name">Entrez le nom: </label>
        <input type="text" name="lastname" id="lastname" required>
    </div>
    <div class="form-example">
        <label for="name">Entrez la classe: </label>
        <input type="text" name="classroom" id="classroom" required>
    </div>
    <div class="form-example">
        <input type="submit" value="Valider">
    </div>
</form>

</body>

</html>
