package com.practice.kube_practice_server.global.common.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@GetMapping("/health-check")
	public String healthCheck() {
		return "OK";
	}

}
