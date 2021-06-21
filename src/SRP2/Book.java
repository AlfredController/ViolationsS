/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP2;


public class Book {
    	Page currentPage = new Page();

	public String getTitle(){

		return "Un gran libro";

	}


	public String getAuthor(){

		return "JK Rowling";

	}


	public void turnPage(){
		//pointer to the next page
	}

	public Page getCurrentPage(){
		return currentPage;
	}

	public void printCurrentPage(){

		System.out.println("Contenido de la página");

	}


	public static void main(String[] args) {

		Book newBook = new Book();
		newBook.printCurrentPage(); // (A)


	}
}
