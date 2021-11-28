/*
 * generated by Xtext 2.25.0
 */
package game.of.life.generator

import game.of.life.lifeDsl.Model
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LifeDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val root = resource.allContents.head as Model;
		 if (root !== null) {
			 var path = "GameOfLife/" + resource.getURI().lastSegment + "/"
			 fsa.generateFile(path+"RulesOfLife.java",JavaGenerator.toJava(root))
		 }
	}
}