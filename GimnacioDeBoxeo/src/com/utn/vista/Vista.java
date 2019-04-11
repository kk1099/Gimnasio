package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.Aspirantes;
import com.utn.controlador.Categorias;

public class Vista {
	
		private static Scanner scan;
		public static int peso;
		public static String nombre;
		private static Categorias categoria;
		private static Aspirantes[] aspirantes;	
		
		public static int getPeso() {
			return peso;
		}

		public static void setPeso(int peso) {
			Vista.peso = peso;
		}

		public static String getNombre() {
			return nombre;
		}

		public static void setNombre(String nombre) {
			Vista.nombre = nombre;
		}

		public static Categorias getCategoria() {
			return categoria;
		}

		public static void setCategoria(Categorias categoria) {
			Vista.categoria = categoria;
		}

		public static Aspirantes[] getAspirantes() {
			return aspirantes;
		}

		public static void setAspirantes(Aspirantes[] aspirantes) {
			Vista.aspirantes = aspirantes;
		}

			
			public static void main(String[] args){		
				scan = new Scanner(System.in);
								
					for(int i=0; i < 2; i++) {
					
						
					System.out.println("-------------------------------------------");
					System.out.println("                 *Gimnasio*                ");
					System.out.println("-------------------------------------------");
					System.out.println("                                           ");
					System.out.println(" Ingrese su nombre : ");
					System.out.println("                                           ");			
					scan.next();
					System.out.println("-------------------------------------------");
					System.out.println("                 *Gimnasio*                ");
					System.out.println("-------------------------------------------");
					System.out.println("                                           ");
				    System.out.println(" Ingrese su peso : ");
					System.out.println("                                           ");
					scan.nextInt();
					
					}
					
					if (peso > 48.988 && peso < 50.802){
						  setCategoria(Categorias.MOSCA);
						} else if (peso > 52.163 && peso < 53.525) {
							setCategoria(Categorias.GALLO);
						} else if (peso > 55.338 && peso < 57.152) {
							setCategoria(Categorias.PLUMA);
						} else if (peso > 58.967 && peso < 61.237) {
							setCategoria(Categorias.LIGERO);
						} else if (peso > 63.503 && peso < 66.678) {
							setCategoria(Categorias.WELTER);
						} else if (peso > 69.853 && peso < 72.562) {
							setCategoria(Categorias.MEDIANO);
						} else if (peso > 76.205 && peso < 79.378) {
							setCategoria(Categorias.MEDIOPESADO);
						} else if (peso > 91 && peso < 99999) {
							setCategoria(Categorias.PESADO);
						}
					
}
}
