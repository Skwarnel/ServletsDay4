package pl.coderslab.servletyday4;

import java.util.ArrayList;
import java.util.List;

public class FurnitureDao {

	public List<Furniture> getList() {
		List<Furniture> list = new ArrayList<>();
		list.add(new Furniture(1, "Sofa Reggae szara", "Trzyosobowa sofa retro. ", 10));
		list.add(new Furniture(2, "Narożnik lewy Belle",
				"Duży narożnik Belle idealnie nadaje się dla licznej rodziny. ", 120));
		list.add(new Furniture(3, "Moduł narożny Puzzle", "Puzzle to oryginalny system mebli modułowych. ", 2));
		list.add(new Furniture(4, "ONTARIO 160X200",
				"Nowoczesne łóżko Ontario łączy w sobie oryginalność, luksus oraz wygodę.  ", 33));
		list.add(new Furniture(5, "Sofa dwuosobowa",
				"Sofa z funkcją spania Colista to prosta forma połączona z ogromną wygodą. ", 11));
		list.add(new Furniture(6, "TOALETKA KOSMETYCZNA",
				"Niepowtarzalna toaletka kosmetyczna ze stołkiem i z dużym lustrem. ", 5));

		return list;
	}
}
