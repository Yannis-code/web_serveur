<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

    <h1>Bienvenue sur le carnet en ligne</h1>

    <ul>
        <li><a href="/students">Liste des élèves</a></li>
        <li><a href="/gommettes-teacher">Liste des gommettes configurées</a></li>
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

    <h2>Ajouter une gommette à un élève: </h2>

    <form action="/students/gommettes/add" method="post">
        <select type="text" name="idStudent" id="idStudent" required>
            <#list students as student>
                <option value = "${student.id}">${student.id} - ${student.firstName} ${student.lastName}</option>
            </#list>
        </select><br>

        <select type="text" name="idGommette" id="idGommette" required>
            <#list gommettes as gommette>
                <option value = "${gommette.id}">${gommette.id} - ${gommette.name} ${gommette.color}</option>
            </#list>
        </select><br>

        <label for="reason">Entrez la raison: </label>
        <input type="text" name="reason" id="reason" required><br>

        <input type="submit" value="Valider">

    </form>
    
</body>

</html>
