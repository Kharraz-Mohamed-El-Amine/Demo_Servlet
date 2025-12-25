<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>exemple 1 et 2</title>
    <style>

        h1 {
            text-align: center;
            color: #333;
        }
        form {
            text-align: center;
            margin-top: 30px;
        }

    </style>
</head>
<body>
<form action="login" method="get">
    <label>Nom:</label>
    <input type="text" name="nom">
    <label>prenom:</label>
    <input type="text" name="prenom">
    <input type="submit">
</form>
<hr>
<h1>Choix d'une filière</h1>

<form action="Control_servlet" method="post">
    <table align="center">
        <tr>
            <td>Choisissez la filière</td>
            <td>
                <select name="filiere">
                    <option value="GSTR">GSTR</option>
                    <option value="GI">GI</option>
                </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Envoyer" name="btn1"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>