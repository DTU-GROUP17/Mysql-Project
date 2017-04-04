package app;

import dao.SQL.SQLOperator;
import connectors.DALException;
import dto.Operator;

import java.sql.SQLException;

import connectors.Connector;

public class App {
	public static void main(String[] args) {
		try {
			new Connector();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Operatoer nummer 3:");
		SQLOperator opr = new SQLOperator();
		try {
			System.out.println(opr.find(3));
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Indsaettelse af ny operatoer med opr_id =  4");
		Operator oprDTO = new Operator(4, "Don Juan", "DJ", "000000-0000", "iloveyou");
		try {
			opr.create(oprDTO);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Operatoer nummer 4:");
		try {
			System.out.println(opr.find(4));
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Opdatering af initialer for operatoer nummer 4");
		oprDTO.setIni("DoJu");
		try {
			opr.update(oprDTO);
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Operatoer nummer 4:");
		try {
			System.out.println(opr.find(4));
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Alle operatoerer:");
		try {
			System.out.println(opr.all());
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Operatoer nummer 5:");
		try {
			System.out.println(opr.find(5));
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}

	}
}
