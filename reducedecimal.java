class main{
public String renderWhateverThatIs(double in) {
    return String.format("%.02f", in / 100000.0);
}

System.out.println(renderWhateverThatIs(3402100.5323));
}
//> 34,02
