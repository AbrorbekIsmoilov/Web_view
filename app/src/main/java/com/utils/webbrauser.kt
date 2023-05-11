package com.utils

object webbrauser {
    var str = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>Document</title>\n" +
            "    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
            "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\">\n" +
            "    <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n" +
            "</head>\n" +
            "<style>\n" +
            "\t*{\n" +
            "    margin: 0;\n" +
            "    padding: 0;\n" +
            "    box-sizing: border-box;\n" +
            "    text-decoration: none;  \n" +
            "}\n" +
            "\n" +
            ".conatainer {\n" +
            "    width: 100%;\n" +
            "}\n" +
            "\n" +
            ".navbar {\n" +
            "    display: flex;\n" +
            "    justify-content: space-between;\n" +
            "    align-items: center;\n" +
            "    margin: 30px 100px;\n" +
            "}\n" +
            "\n" +
            ".menu {\n" +
            "    position: absolute;\n" +
            "    top: 30px;\n" +
            "    right: 10px;\n" +
            "}\n" +
            "\n" +
            ".logo span{\n" +
            "    width: 20px;\n" +
            "    height: 20px;\n" +
            "    background-color: rgb(179, 152, 31);\n" +
            "    border-radius: 50%;\n" +
            "}\n" +
            ".logo {\n" +
            "    display: flex;\n" +
            "    align-items: center;\n" +
            "    gap: 10px;\n" +
            "}\n" +
            "\n" +
            ".logo h2{\n" +
            "    font-size: 32px;\n" +
            "}\n" +
            "\n" +
            ".logo p{\n" +
            "    font-size: large;\n" +
            "    font-weight: 300;\n" +
            "}\n" +
            ".nav {\n" +
            "    display: flex;\n" +
            "    align-items: center;\n" +
            "    list-style: none;\n" +
            "}\n" +
            "\n" +
            "a {\n" +
            "    text-decoration: none;\n" +
            "    list-style: none;\n" +
            "    color: black;\n" +
            "}\n" +
            ".nav li a{\n" +
            "    color: black;\n" +
            "    font-weight: 300;\n" +
            "    font-family: serif;\n" +
            "    list-style: none;\n" +
            "\n" +
            "}\n" +
            ".nav li:nth-child(2){\n" +
            "    border-left: 1px solid black;\n" +
            "    border-right: 1px solid black;\n" +
            "    padding: 0 10px;\n" +
            "}\n" +
            "\n" +
            ".nav li{\n" +
            "    padding: 0px 10px;\n" +
            "}\n" +
            "\n" +
            ".card {\n" +
            "    margin-top: 150px;\n" +
            "    display: flex;\n" +
            "    align-items: center;\n" +
            "    justify-content: center;\n" +
            "}\n" +
            "\n" +
            ".img-text{\n" +
            "    margin-left: 40px;\n" +
            "}\n" +
            ".img img{\n" +
            "    border-radius: 50%;\n" +
            "    margin-bottom: 50px;\n" +
            "    width: 450px;\n" +
            "}\n" +
            "\n" +
            ".img-text h1{\n" +
            "    font-size: 85px;\n" +
            "}\n" +
            "\n" +
            ".img-text p{\n" +
            "    font-size: 18px;\n" +
            "    margin: 20px 0px;\n" +
            "}\n" +
            "\n" +
            ".img-text .img-text-p {\n" +
            "    font-size: 15px;\n" +
            "}\n" +
            ".buttons button{\n" +
            "    width: 120px;\n" +
            "    height: 120px;\n" +
            "    border-radius: 50%;\n" +
            "    font-size: 18px;\n" +
            "    cursor: pointer;\n" +
            "    transition: .5s;\n" +
            "    margin-top: 30px;\n" +
            "    margin-right: 10px;\n" +
            "    border: 1px solid rgb(80, 78, 78);\n" +
            "}\n" +
            "\n" +
            ".buttons button:nth-child(1){\n" +
            "    background-color: rgb(223, 197, 24);\n" +
            "}\n" +
            ".buttons button:nth-child(2){\n" +
            "    background-color: red;\n" +
            "}\n" +
            ".buttons button:nth-child(3){\n" +
            "    background-color: rgb(66, 151, 216);\n" +
            "}\n" +
            "\n" +
            ".buttons button:hover {\n" +
            "    background-color: white;\n" +
            "}\n" +
            "\n" +
            ".footer {\n" +
            "    border-top: 1px solid rgb(93, 89, 89);\n" +
            "    display: flex;\n" +
            "    justify-content: space-between;\n" +
            "    align-items: center ;\n" +
            "}\n" +
            "\n" +
            ".footer-text p b{\n" +
            "    padding-right: 10px;\n" +
            "}\n" +
            ".footer-text {\n" +
            "    margin: 30px 100px;\n" +
            "}\n" +
            "\n" +
            ".footer-text h1{\n" +
            "    font-weight: 400;\n" +
            "}\n" +
            "\n" +
            ".box {\n" +
            "    display: flex;\n" +
            "    justify-content: space-between;\n" +
            "    align-items: flex-start;\n" +
            "    padding: 50px 300px;\n" +
            "    border-bottom: 1px solid rgb(63, 59, 59);\n" +
            "}\n" +
            "\n" +
            ".h1{\n" +
            "    margin-top: 100px;\n" +
            "    padding-left: 300px;\n" +
            "}\n" +
            "\n" +
            ".years {\n" +
            "    margin-bottom: 50px;\n" +
            "}\n" +
            "\n" +
            ".years p{\n" +
            "    margin-top: 10px;\n" +
            "    color: rgb(54, 52, 52);\n" +
            "    letter-spacing: 1px;\n" +
            "    line-height: 25px;\n" +
            "    \n" +
            "}\n" +
            "\n" +
            ".years li {\n" +
            "    /* margin-right: 50px; */\n" +
            "    letter-spacing: 1px;\n" +
            "    line-height: 30px;\n" +
            "    font-weight: 400;\n" +
            "}\n" +
            "\n" +
            ".about img {\n" +
            "    width: 400px;\n" +
            "}\n" +
            "\n" +
            ".header-text p {\n" +
            "    margin-top: 20px;\n" +
            "    line-height: 25px;\n" +
            "    letter-spacing: 1px;\n" +
            "}\n" +
            "\n" +
            ".text-contact h1{\n" +
            "    margin-bottom: 10px;\n" +
            "}\n" +
            "\n" +
            ".text-contact p{\n" +
            "    margin-bottom: 10px;\n" +
            "}\n" +
            "\n" +
            ".text-email h2 {\n" +
            "    margin-bottom: 10px;\n" +
            "}\n" +
            "\n" +
            ".text-email p {\n" +
            "    margin-bottom: 10px;\n" +
            "}\n" +
            "\n" +
            ".text-phone h2 {\n" +
            "    margin-bottom: 10px;\n" +
            "}\n" +
            "\n" +
            ".text-phone p {\n" +
            "    margin-bottom: 10px;\n" +
            "}\n" +
            ".top-input {\n" +
            "    display: flex;\n" +
            "    gap: 10px;\n" +
            "}\n" +
            "\n" +
            ".top-input input {\n" +
            "    width: 200px;\n" +
            "    padding: 10px;\n" +
            "}\n" +
            "\n" +
            ".input-bottom {\n" +
            "    display: flex;\n" +
            "    justify-content: space-between;\n" +
            "}\n" +
            "\n" +
            ".input-bottom textarea {\n" +
            "    margin-top: 30px;\n" +
            "    width: 60%;\n" +
            "    height: 150px;\n" +
            "    padding: 10px;\n" +
            "}\n" +
            "\n" +
            ".input-bottom button {\n" +
            "    margin-top: 30px;\n" +
            "    width: 130px;\n" +
            "    height: 130px;\n" +
            "    border-radius: 50%;\n" +
            "    font-size: 25px;\n" +
            "    cursor: pointer;\n" +
            "    border: 1px solid rgb(94, 92, 92);\n" +
            "    background-color: rgb(244, 244, 28);\n" +
            "    transition: .5s;\n" +
            "}\n" +
            "\n" +
            "button:hover{\n" +
            "    background-color: white;\n" +
            "}\n" +
            "\n" +
            ".active {\n" +
            "    color: red !important;\n" +
            "}\n" +
            "\n" +
            "@media (min-width:1200px){\n" +
            "    .menu{\n" +
            "        display: none;\n" +
            "    }\n" +
            "}\n" +
            "@media (max-width:1200px){\n" +
            "    .menu{\n" +
            "        display: none;\n" +
            "    }\n" +
            "    \n" +
            "}\n" +
            "\n" +
            "@media (max-width:990px){\n" +
            "    .menu{\n" +
            "        display: none;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "@media (max-width:769px){\n" +
            "    .menu{\n" +
            "        display: none;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "\n" +
            "@media (max-width:447px) {\n" +
            "    .navbar {\n" +
            "        margin-left: 40px;\n" +
            "    }\n" +
            "\n" +
            "    .nav {\n" +
            "        display: none;\n" +
            "    }\n" +
            "    .card {\n" +
            "        width: 450px;\n" +
            "        margin-left: -40px;\n" +
            "        display: flex;\n" +
            "        flex-wrap: wrap;\n" +
            "        flex-direction: row-reverse;\n" +
            "    }\n" +
            "\n" +
            "    .card img {\n" +
            "        width: 300px;\n" +
            "        padding-left: 10px;\n" +
            "    }\n" +
            "    \n" +
            "    .buttons {\n" +
            "        margin-bottom: 30px;\n" +
            "    }\n" +
            "    .footer {\n" +
            "        display: flex;\n" +
            "        flex-wrap: wrap;\n" +
            "    }\n" +
            "\n" +
            "    .about {\n" +
            "        margin-left: 20px;\n" +
            "        width: 300px;\n" +
            "        display: flex;\n" +
            "        flex-wrap: wrap;\n" +
            "    }\n" +
            "\n" +
            "    .box {\n" +
            "        padding: 0px 10px;\n" +
            "    }\n" +
            "\n" +
            "    .box {\n" +
            "        width: 300px;\n" +
            "        display: flex;\n" +
            "        flex-wrap: wrap;\n" +
            "    }\n" +
            "\n" +
            "    .header {\n" +
            "        padding-left: px;\n" +
            "    }\n" +
            "\n" +
            "    .h1{\n" +
            "        padding-left: 30px;\n" +
            "        margin-bottom: 30px;\n" +
            "    }\n" +
            "\n" +
            "    .header-text h1 {\n" +
            "        margin-bottom: 30px;\n" +
            "        margin-left: 20px;\n" +
            "    }\n" +
            "\n" +
            "    .about img {\n" +
            "        width: 350px;\n" +
            "        margin-top: 30px;\n" +
            "        margin-bottom: 30px;\n" +
            "    }\n" +
            "\n" +
            "    .header-text p{\n" +
            "        margin-left: 20px;\n" +
            "    }\n" +
            "\n" +
            "    .input-bottom {\n" +
            "        margin-bottom: 20px;\n" +
            "        /* display: flex; */\n" +
            "    }\n" +
            "\n" +
            "    .top-input input {\n" +
            "        width: 350px;\n" +
            "        padding: 10px;\n" +
            "    }\n" +
            "\n" +
            "    .left-input {\n" +
            "        display: flex;\n" +
            "        flex-wrap: wrap;\n" +
            "        margin-bottom: 10px;\n" +
            "    }\n" +
            "\n" +
            "    .left-input p{\n" +
            "        \n" +
            "    }\n" +
            "\n" +
            "    .top-input{\n" +
            "        width: 400px;\n" +
            "        flex-direction: column-reverse;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "\n" +
            "</style>\n" +
            "<body>\n" +
            "    <div class=\"container\">\n" +
            "       <div class=\"menu\">\n" +
            "          <i class=\"fa-solid fa-bars\"></i>  \n" +
            "       </div> \n" +
            "        <div class=\"navbar\">\n" +
            "            <div class=\"logo\">\n" +
            "                <span></span>\n" +
            "                <h2>Nicol Rider</h2>\n" +
            "                <p>Editor</p>\n" +
            "            </div>\n" +
            "            <div class=\"nav\">\n" +
            "                <li>\n" +
            "                    <a href=\"resume.html\">Resume</a>\n" +
            "                </li>\n" +
            "                <li>\n" +
            "                    <a href=\"project.html\">Project</a>\n" +
            "                </li>\n" +
            "                <li>\n" +
            "                    <a href=\"contact.html\">Contact</a>\n" +
            "                </li>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "\n" +
            "        <div class=\"header\" data-aos=\"flip-left\" data-aos-duration=\"2000\">\n" +
            "           <div class=\"card\">\n" +
            "            <div class=\"img\">\n" +
            "                <img src=\"https://static.wixstatic.com/media/c837a6_a5f904abc9224779abfc65cb53fa6ba7~mv2.jpg/v1/crop/x_158,y_151,w_1117,h_1117/fill/w_600,h_600,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/gettyimages-1284121212-2048x2048_edited_.jpg\" alt=\"\">\n" +
            "            </div>\n" +
            "            <div class=\"img-text\">\n" +
            "                <h1>Hello</h1>\n" +
            "                <p> <b> A Bit About Me</b></p>\n" +
            "                <p class=\"img-text-p\">\n" +
            "                    I'm a paragraph. Click here to add your own text <br> and edit me. I’m a great place for you to tell a story <br> and let your users know a little more about you.\n" +
            "                </p>\n" +
            "            <div class=\"buttons\"> \n" +
            "                <button><a href=\"resume.html\">Resume</a> </button>\n" +
            "                <button><a href=\"project.html\">Project</a> </button>\n" +
            "                <button><a href=\"contact.html\">Project</a> </button>\n" +
            "            </div>   \n" +
            "            </div>\n" +
            "        </div\n" +
            "     </div>\n" +
            "\n" +
            "        <div class=\"footer\">\n" +
            "            <div class=\"footer-text\">\n" +
            "                <h1>Phone</h1>\n" +
            "                <p>123-456-7890</p>\n" +
            "            </div>\n" +
            "            <div class=\"footer-text\">\n" +
            "                <h1>Email</h1>\n" +
            "                <p>info@mysite.com</p>\n" +
            "            </div>\n" +
            "            <div class=\"footer-text\">\n" +
            "                <h1>Folow Me</h1>\n" +
            "                <p><b>in</b><a href=\"#\"><i class=\"fa-brands fa-twitter\"></i></a></p>\n" +
            "            </div>\n" +
            "            <div class=\"footer-text\">\n" +
            "                <p>© 2023 By Nicol Rider. <br>\n" +
            "                    Proudly created with Wix.com</p>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</body>\n" +
            "<script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n" +
            "<script>\n" +
            "    AOS.init();\n" +
            "  </script>\n" +
            "</html>\n"
}
