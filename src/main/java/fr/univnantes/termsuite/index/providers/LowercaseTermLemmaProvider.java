package fr.univnantes.termsuite.index.providers;

import java.util.Collection;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import fr.univnantes.termsuite.index.TermIndexValueProvider;
import fr.univnantes.termsuite.model.Term;
import fr.univnantes.termsuite.model.TermProperty;

public class LowercaseTermLemmaProvider implements TermIndexValueProvider {

	private static final String MSG_NOT_SET = "Property lemma not set";
	
	@Override
	public Collection<String> getClasses(Term term) {
		Preconditions.checkArgument(term.isPropertySet(TermProperty.LEMMA), MSG_NOT_SET);
		return ImmutableList.of(term.getLemma().toLowerCase());
	}
}
