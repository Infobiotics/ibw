/*
 * generated by Xtext
 */
package roadblock.xtext.ibl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import roadblock.xtext.ibl.ui.highlighting.IblSemanticHighlightingCalculator;
import roadblock.xtext.ibl.ui.highlighting.IblSemanticHighlightingConfiguration;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class IblUiModule extends roadblock.xtext.ibl.ui.AbstractIblUiModule {

	public IblUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(IHighlightingConfiguration.class).to(IblSemanticHighlightingConfiguration.class);
		binder.bind(ISemanticHighlightingCalculator.class).to(IblSemanticHighlightingCalculator.class);
	}
}
