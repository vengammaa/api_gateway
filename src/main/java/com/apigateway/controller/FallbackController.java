package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	
	@GetMapping("/recastBoTableauMigratorFallback")
	public String recastBoTableauMigratorFallback() {
		
		return "Recast BO Tableau Migrator is down at this time !!";
		
	}
	
	@GetMapping("/recastBoTableauFunctionMappingFallback")
	public String recastBoTableauFunctionMappingFallback() {
		
		return "Recast Bo Tableau Function Mapping is down at this time !!";
		
	}
	
	@GetMapping("/recastTableauMigratorFallback")
	public String recastTableauMigratorFallback() {
		
		return "Recast Tableau Migrator is down at this time !!";
		
	}
	
	@GetMapping("/recastBOAnalyserFallback")
	public String recastBOAnalyserFallback() {
		
		return "Recast bo Analyser is down at this time !!";
		
	}

}
