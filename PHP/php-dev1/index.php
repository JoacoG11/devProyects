<?php
    #Definimos contsante con el URL de la API
    const API_URL = "https://whenisthenextmcufilm.com/api";

    #Iniciamos nueva sesion de cURL, ch = cURL handle
    $ch = curl_init(API_URL);
    
    //Indicar que queremos recibir el resultado de la peticion y no mostrar en pantalla
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

    /*
    Ejecutar la peticion 
    y guardar el resultado
    */
    $result = curl_exec($ch);

    //Alternativa si solo quiero hacer un GET de una API
    //$result = file_get_contents(API_URL)

    //Obtenemos los datos del resultado y lo guardamos en formato JSON
    $data = json_decode($result, true);


    //Cerramos conexion cURL
    curl_close($ch);
?>

<head>
    <meta charset="UTF-8">
     <title> La Proxima pelicula de Marvel</title>
     <meta name="descripcion" content="La proxima pelicula de Marvel">
     <meta name="vievport" content="width=device-width, initial-scale=1.0">
        <!-- Centered viewport -->
        <link
        rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.classless.min.css"
        >  
</head>

<main>
    <pre style="font-size:7px; overflow: scroll; height:200px">
    <?php var_dump($data); ?>
    </pre>
    <section>
        <img src="<?= $data["poster_url"]; ?>" width="300" 
        alt="Poster de <?= $data["title"]; ?>" style="border-radius: 15px;"
        >
    </section>
    <hgroup>
        <h3><?= $data["title"]; ?> se estrena en <?= $data["days_until"]; ?> dias</h3>
        <p>Fecha de estreno: <?= $data["release_date"];?> </p>
        <p>La proxima pelicula es: <?= $data["following_production"]["title"];?> </p>
    </hgroup>
</main>

<style>
    :root{
        color-scheme: light dark;
    }

    body{
        display: grid;
        place-content: center;
    }

    section{
        display: flex;
        justify-content: center;
        text-align: center;
    }

    hgroup{
        display: flex;
        flex-direction: column;
        justify-content: center;
        text-align: center;
    }

    image{
        margin: 0 auto;
    }
</style>

