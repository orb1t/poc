// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

package com.spaeth.appbase.core.startupinfo;

import java.util.ArrayList;
import java.util.List;

import com.spaeth.appbase.component.StreamProvider;
import com.spaeth.appbase.core.startupinfo.QuestionStartupInfo.Answer;
import com.spaeth.appbase.model.Callback;

public class QuestionStartupInfoBuilder extends QuestionStartupInfoBuilderBase<QuestionStartupInfoBuilder> {
	public QuestionStartupInfoBuilder(final Callback<Answer> callback) {
		super(new QuestionStartupInfo(Answer.class, callback));
	}

	public QuestionStartupInfo build() {
		return getInstance();
	}
}

class QuestionStartupInfoBuilderBase<GeneratorT extends QuestionStartupInfoBuilderBase<GeneratorT>> {
	private final QuestionStartupInfo instance;

	protected QuestionStartupInfoBuilderBase(final QuestionStartupInfo aInstance) {
		instance = aInstance;
	}

	protected QuestionStartupInfo getInstance() {
		return instance;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT setTitle(final String aValue) {
		instance.setTitle(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT setQuestion(final String aValue) {
		instance.setQuestion(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT setAnswers(final List<Answer> aValue) {
		instance.setAnswers(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT addAnswer(final Answer aValue) {
		if (instance.getAnswers() == null) {
			instance.setAnswers(new ArrayList<Answer>());
		}

		((ArrayList<Answer>) instance.getAnswers()).add(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT setQuestionIcon(final StreamProvider aValue) {
		instance.setQuestionIcon(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT setQuestionImage(final StreamProvider aValue) {
		instance.setQuestionImage(aValue);

		return (GeneratorT) this;
	}
}
