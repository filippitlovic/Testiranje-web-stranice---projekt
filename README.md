Projektni zadatak - Testiranje web stranice "Ferivi" - FILIP PITLOVIĆ

Za izradu ovog projekta koristio sam stranicu "Ferivi" - https://ferivisport.hr/

Tema projekta bila je ispitati odnosno testirati rad web stranice. Testiranje sam obavio u programu IntelliJ koristeći programski jezik Java. 
Stranica je testirana pomoću 5 slijedećih testova:

	a) 1. Test: Klik na gumba za login. Upisivanje email-a, passworda i logiranje u sustav stranice
	b) 2. Test: Pretraživanje proizvoda. Upisivanje traženog proizvoda u 'search' i klik na gumb za pretraživanje
	c) 3. Test: Filtriranje proizvoda po odabranim kategorijama. Klik na checkbox za odabir kategorije "Obuča". Prikazuju se svi proizvodi pod tom kategorijom.
	d) 4. Test: Dodavanje proizvoda u košaricu. Klikom na gumb 'Dodaj u košaricu', proizvod se dodaje u košaricu i košarica se otvara.
	e) 5. Test: Biranje kategorije iz izbornika. Odabire se kategorija "Muškarci".

Način korištenja:
Projekt se sastoji od 4 Java klase: PageObject, References, TestPlan i WebTest.
Za testiranje ovog programa potreban je Chromedriver koji se nalazi u folderu projekta.
Testove je moguće testirati zasebno u klasi TestPlan. Testiranje se obavlja na način klikom na zeleni krug pokraj '@Test' koji se nalazi pokraj svakog testa.
Otvara se preglednik s 'Ferivi' stranicom i test se odvija. 
