package com.criteria.parser;

import java.util.ArrayList;
import java.util.List;
import com.a4.product.beans.Personalization;

public class PersonlizationParser {
	public  List<Personalization> getPersonalization(
			String personalizevalue) {

		String PersonalizationArr[] = personalizevalue.split(",");
		List<Personalization> personaliseList = new ArrayList<Personalization>();

		for (int i = 0; i <= PersonalizationArr.length - 1; i++) {
			Personalization perObj = new Personalization();
			String pers = PersonalizationArr[i];
			String[] temp = null;
			if (pers.contains("=")) {
				temp = pers.split("=");
				perObj.setType(temp[0]);
				perObj.setAlias(temp[1]);
			} else {
				perObj.setType(temp[1]);
			}

			personaliseList.add(perObj);
		}

		return personaliseList;

	}
}