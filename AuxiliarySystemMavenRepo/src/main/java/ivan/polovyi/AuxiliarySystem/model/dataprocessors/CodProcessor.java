package ivan.polovyi.AuxiliarySystem.model.dataprocessors;

import java.math.BigInteger;
import java.util.ArrayList;

public class CodProcessor {

	public ArrayList<String> codAmplifier(ArrayList<String> codes) {

		for (int i = 0; i < codes.size(); i++) {

			String lettersCode = codes.get(i).replaceAll("[0-9]", "");
			String numbersCode = "1" + codes.get(i).replaceAll(lettersCode, "");
			BigInteger intNumber = new BigInteger(numbersCode).add(new BigInteger("1"));
			codes.set(i, intNumber.toString().replaceFirst("1", lettersCode));
		}

		return codes;
	}

}
