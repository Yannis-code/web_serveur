<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

    <h1>Bienvenue sur le carnet en ligne</h1>

    <ul>
        <li><a href="/login">Se connecter</a></li>
        <li><a href="/gommettes">Liste des gommettes configurées</a></li>
        <li><a href="/studentGommettes">Liste des gommettes de chaque élève</a></li>
    </ul>

    <h2> Consulter les gommettes d'un élève en particulier : </h2>

    <form action="/students/gommettes" method="post">
        <select type="text" name="id" id="id" required>
            <#list students as student>
                <option value = "${student.id}">${student.id} - ${student.firstName} ${student.lastName}</option>
            </#list>
        </select>
        <input type="submit" value="Valider">

    </form>

</body>

</html>
