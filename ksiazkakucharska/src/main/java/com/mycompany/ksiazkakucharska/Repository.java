/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ksiazkakucharska;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aldil
 */
public class Repository {

    public List<String> wszystkie_kategorie = new ArrayList<String>();
    public List<Recipe> wszystkie_przepisy = new ArrayList();

    public List<String> getAllCategories() {
        return wszystkie_kategorie;
    }

    public List<Recipe> getAllRecipies() {
        return wszystkie_przepisy;
    }

    public List<Recipe> getRecipesWithText(String searchedText) {
        List<Recipe> searchResult = new ArrayList();

        for (Recipe recipe : getAllRecipies()) {
            String recipeText = recipe.toString();
            if (recipeText.contains(searchedText)) {
                searchResult.add(recipe);
            }
        }

        return searchResult;
    }

    public void addRecipe(Recipe recipe) {   
        List<String> categories = recipe.getCategories();

        for (int i = 0; i < categories.size(); i++) {
            if (!wszystkie_kategorie.contains(categories.get(i))) {
                wszystkie_kategorie.add(categories.get(i));
            }
        }

        wszystkie_przepisy.add(recipe);
    }

//    void dodawaniePrzepisow() {
//        List<String> ingredients = new ArrayList();
//
//        ingredients.add("     300 g mąki\n"
//                + "    250 g zimnego masła (50 g masła można zastąpić smalcem)\n"
//                + "    1,5 łyżeczki proszku do pieczenia\n"
//                + "    5 łyżek cukru\n"
//                + "    1 łyżka cukru wanilinowego\n"
//                + "    1 jajko"
//                + "     1,5 kg jabłek na szarlotkę (szara reneta, antonówka) lub 1 słoik ok. 800 g gotowych jabłek\n"
//                + "    5 łyżek cukru\n"
//                + "    1/2 łyżeczki cynamonu\n"
//                + "    cukier puder");
//
//        List<String> category = new ArrayList();
//        category.add("Desery");
//        category.add("Przepisy Polskie");
//        category.add("Wegetariańskie");
//        category.add("Jesienne");
//        String sciezka_zdjecia = System.getProperty("user.dir") + "\\src\\main\\java\\Zdjecia\\szarlotka.jpg";
//        NewJFrame.Przepis szarlotka;
//        szarlotka = new NewJFrame.Przepis("Szarlotka", ingredients, "\nCIASTO\n"
//                + "\n"
//                + "    Z podanych składników zagnieść ciasto kruche (w robocie kuchennym lub na stolnicy): do przesianej mąki dodać pokrojone w kostkę zimne masło, proszek do pieczenia, cukier i cukier wanilinowy.\n"
//                + "    Rozdrabniać składniki na kruszonkę, pod koniec dodać jajko i połączyć składniki w jednolite i gładkie ciasto (może być klejące).\n"
//                + "    Włożyć do zamrażarki na ok. 15 - 30 minut.\n"
//                + "\n"
//                + "JABŁKA\n"
//                + "\n"
//                + "    Jabłka obrać, pokroić na ćwiartki i wyciąć gniazda nasienne. Pokroić na mniejsze kawałki i włożyć do szerokiego garnka lub głęboką patelnię.\n"
//                + "    Dodać cukier i smażyć przez ok. 10 - 15 minut co chwilę mieszając, aż jabłka zmiękną i zaczną się rozpadać. Pod koniec dodać cynamon.\n"
//                + "\n"
//                + "PIECZENIE\n"
//                + "\n"
//                + "    Piekarnik nagrzać do 180 stopni C. Przygotować małą foremkę (np. o średnicy 26 cm lub 21 x 28 cm lub 24 x 24 cm).\n"
//                + "    Wyjąć jedną połówkę ciasta z zamrażarki, pokroić nożem na plasterki i wylepić nimi spód formy, doklejając brakujące miejsca palcami.\n"
//                + "    Na spód wyłożyć jabłka.\n"
//                + "    Pozostałe ciasto zetrzeć na tarce bezpośrednio na jabłka (lub pokroić ciasto na plasterki i ułożyć na wierzchu).\n"
//                + "    Wstawić do piekarnika i piec przez ok. 50 - 55 minut na złoty kolor. Posypać cukrem pudrem. Pokroić po ostudzeniu.\n"
//                + "", category, sciezka_zdjecia) {
//        };
//
//        List<String> listC = new ArrayList();
//        List<String> listD = new ArrayList();
//        listC.add("Spód:\n"
//                + "\n"
//                + "    ok. 200 g kakaowych ciasteczek owsianych\n"
//                + "    2 łyżki roztopionego masła\n"
//                + "\n"
//                + "Maliny do środka sernika:\n"
//                + "\n"
//                + "    250 g malin\n"
//                + "    4 łyżki cukru\n"
//                + "    2 łyżeczki soku z cytryny\n"
//                + "    kawałek skórki z cytryny\n"
//                + "\n"
//                + "Masa serowa:\n"
//                + "\n"
//                + "     1 kg tłustego twarogu\n"
//                + "    3 łyżki mąki ziemniaczanej\n"
//                + "    3/4 szklanki cukru\n"
//                + "    5 jajek (M)\n"
//                + "    2 żółtka\n"
//                + "    1/2 łyżeczki aromatu migdałowego\n"
//                + "    125 ml śmietanki kremowej 30%\n"
//                + "    200 g białej czekolady\n"
//                + "\n"
//                + "Karmelizowana skorupka i dekoracja:\n"
//                + "\n"
//                + "    ok. 4 łyżki białego cukru\n"
//                + "    świeże maliny\n"
//                + "");
//
//        listD.add("Desery");
//        listD.add("Przepisy Polskie");
//        listD.add("Wegetariańskie");
//        sciezka_zdjecia = System.getProperty("user.dir") + "\\src\\main\\java\\Zdjecia\\sernik.jpg";
//        NewJFrame.Przepis sernik;
//        sernik = new NewJFrame.Przepis("Sernik", listC, "Spód:\n"
//                + "\n"
//                + "    Dno tortownicy o średnicy ok. 24-25 cm z odpinaną obręczą wyłożyć papierem do pieczenia, zapiąć obręcz wypuszczając papier poza obręcz. \n"
//                + "    Ciasteczka zmielić w malakserze/rozdrabniaczu, dodać roztopione masło i zmiksować do połączenia. Masą wyłożyć dno tortownicy, mocno uklepując. Wstawić do lodówki.\n"
//                + "\n"
//                + "Maliny do środka sernika:\n"
//                + "\n"
//                + "    Piekarnik nagrzać do 180 stopni C (grzanie góra i dół bez termoobiegu). Do naczynia żaroodpornego włożyć maliny, posypać cukrem, skropić sokiem z cytryny, w środek włożyć skórkę z cytryny i wstawić do piekarnika. Piec bez przykrycia przez 20 minut.\n"
//                + "    Wyjąć i ostudzić, delikatnie wylać na sitko zawieszone na miseczce, odsączyć. Większość upieczonych malin wykorzystujemy do sernika (do masy serowej), kilka zachowanych malin wkładamy do odcedzonego soku malinowego, przelewamy wszystko do rondelka i podgrzewamy na małym ogniu przez około 15 minut. Schłodzony i ostudzony syrop wykorzystujemy do podawania z sernikiem.\n"
//                + "\n"
//                + "Masa serowa:\n"
//                + "\n"
//                + "    Twaróg zmiksować w malakserze na gładką masę lub zmielić trzykrotnie w maszynce do mięsa, ewentualnie rozmiksować blenderem ręcznym (żyrafą).\n"
//                + "    Piekarnik nagrzać do 210 stopni C (grzanie góra i dół bez termoobiegu).\n"
//                + "    Do twarogu dodać mąkę i cukier i zmiksować (w mikserze lub malakserze) przez minutę. Dodawać po jednym jajku, miksując na małych obrotach przez około 30 sekund po każdym dodanym jajku, na koniec zmiksować z żółtkami, aromatem migdałowym i śmietanką kremówką.\n"
//                + "    Czekoladę połamać na kosteczki i roztopić, następnie dodawać stopniowo do masy ciągle miksując na małych obrotach miksera.\n"
//                + "    Gładką masę wylać na spód z ciasteczek. Upieczone maliny włożyć w równomiernych odstępach do masy serowej, zanurzając je na głębokość ok. 2 cm (jeśli maliny zostaną przy powierzchni sernik będzie pękał). Sernik wstawić na kratkę do środkowej części piekarnika. Piec przez 12 minut, następnie zmniejszyć temperaturę do 100 stopni C i piec przez kolejne 55 minut. Po tym czasie środek sernika ma być już ścięty ale ciągle miękko uginać się pod palcem.\n"
//                + "    Sernik wyjmować stopniowo z piekarnika, uchylając na początku drzwiczki, później wysuwając go z piekarnika. Gdy sernik będzie całkowicie wystudzony obkroić go nożem przy obręczy, zdjąć obręcz i wstawić do lodówki na noc lub minimum kilka godzin. Przechowywać w lodówce bez przykrycia.\n"
//                + "\n"
//                + "Karmelizowana skorupka:\n"
//                + "\n"
//                + "    Schłodzony sernik przed podaniem posypać równą warstwą cukru. Cukier opalić palnikiem aby się skarmelizował (punkt po punkcie, powolnymi ruchami). Podawać z malinami i syropem malinowym.\n"
//                + "", listD, sciezka_zdjecia) {
//        };
//
//        List<String> listE = new ArrayList();
//        List<String> listF = new ArrayList();
//        listE.add(" 300 g szpinaku\n"
//                + " 250 g ziemniakow)\n"
//                + " 200g maki\n"
//                + " 2 jajka\n"
//                + " bulka tarta\n");
//
//        listF.add("Obiad");
//
//        listF.add("Przepisy Wloskie");
//
//        listF.add("Wegetarianskie");
//
//        sciezka_zdjecia = System.getProperty("user.dir") + "\\src\\main\\java\\Zdjecia\\gnochi.jpg";
//
//        NewJFrame.Przepis gnochi;
//
//        gnochi = new NewJFrame.Przepis("Gnochi", listE, "\nKLUSKI\n"
//                + "\n"
//                + " Ziemnaki ugotowac, obrac, wymieszac z maka i jajkami na ciasto\n"
//                + " Gotowe kluski gotowac minute po wrzuceniu do wrzacej wody\n"
//                + " Podawać na talerzu\n"
//                + "\n"
//                + "", listF, sciezka_zdjecia) {
//        };
//
//        List<String> listG = new ArrayList();
//
//        List<String> listH = new ArrayList();
//        listG.add(" 300 g schabu\n"
//                + " 250 g ziemniakow)\n"
//                + " 200g maki\n"
//                + " 2 jajka\n"
//                + " bulka tarta\n");
//
//        listH.add("Obiad");
//
//        listH.add("Przepisy Polskie");
//
//        listH.add("Mięsne");
//
//        sciezka_zdjecia = System.getProperty("user.dir") + "\\src\\main\\java\\Zdjecia\\schabowy.jpg";
//        NewJFrame.Przepis schabowy;
//
//        schabowy = new NewJFrame.Przepis("Schabowy", listG, "\nMIESO\n"
//                + "\n"
//                + " Pokroic schab, obtoczyc w mace, obtaczyc w jajku, obtoczyc w bulce tartej\n"
//                + " Mieso usmażyć, ziemniaki ugotowac\n"
//                + " Podawać na talerzu\n", listH, sciezka_zdjecia) {
//        };
//
//    }
}
