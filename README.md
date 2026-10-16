# medlemsregister-camp
# Ett problem vi löste
Filen som krockade var Main.java filen och system.out.println raden krockade 
eftersom vi hade ändrat samma println-rad på två helt olika feature-grenar med varsin välkomsttext. 

Det som hände var att när den första grenen mergades spärrade GitHub den andra med en merge-konflikt.
Sedan när grenarna skulle slås ihop kunde inte Git inte riktigt välja vilken av välkomst-texterna som skulle behållas automatiskt i programmet. 

Genom att köra git pull origin main på grenen fick vi ner staketen lokalt.
Vi granskade koden mellan konfliktmarkeringarna och valde att ha kvar "Välkommen till Klubbens Register!", och tog bort alla andra markeringar. 

Till sist kontrollerade vi koden med javac och avslutade mergen med en git add, git commit och git puch. 