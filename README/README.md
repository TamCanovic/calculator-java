
LOC - lines of code za zadati projekat je sledeci:
- Fajl calculator.java ima 188 linija koda
- Fajl Start.java ima 26 linija koda
- Ukupno LOC je 188+26 = 214 linija koda

Metoda evaluateExpression:
- Cyclomaty complexity je 7
- Cognitive complexity je 10

Metoda Calculate:
- Cyclomaty complexity je 4
- Cognitive complexity je 11

Napomena: Metrike su dobijene rucno, u prilogu su fajlovi Calculate_01.png Calculate_02.png i evaluateExpression_01.png u kojim je prikazano kako su dobijene navedene metrike.

Zapazanja
- U fajlu Calculator.java vidi se da su implementirane osnovne aritmeticke operacije, sabiranje, oduzimanje, mnozenje i deljenje. Postoji logika ako je prvi broj negativan. Podrzan je prioritet racunskih operacija, moguce je uneti i brojeve sa decimalnim zarezom, nije moguce koristiti zagrade u izrazu. Prvi broj u izrazu moze biti negativan, medjutim nije moguce obaviti aritmeticke operacije sa negativnim brojevima.
- Sto se tice fajla Start.java njegova funkcija je da startuje kalkulator sto je i pozeljno da bismo imali izolovani runner za program od funkcionalnosti.
