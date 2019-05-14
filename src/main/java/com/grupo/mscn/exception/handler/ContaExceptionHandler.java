package com.grupo.mscn.exception.handler;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.grupo.mscn.exception.ResourceExceptionBadRequest;
import com.grupo.mscn.exception.ResourceExceptionNotFound;
import com.grupo.mscn.response.ResponseError;



@ControllerAdvice
public class ContaExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> defaultHandler(Exception ex, WebRequest request) {
		ResponseError response = new ResponseError("Ocorreu um erro no servidor - Serviço indisponivel",
				HttpStatus.INTERNAL_SERVER_ERROR.value());
		logger.info(ex.getMessage());
		ex.printStackTrace();
		return handleExceptionInternal(ex, response, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}

	@ExceptionHandler(ResourceExceptionNotFound.class)
	public ResponseEntity<Object> resourceExceptionNotFound(ResourceExceptionNotFound ex, WebRequest request) {
		ResponseError response = new ResponseError(ex.getMessage(), HttpStatus.NOT_FOUND.value());
		logger.info(ex.getMessage());
		ex.printStackTrace();
		return handleExceptionInternal(ex, response, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}

	@ExceptionHandler(ResourceExceptionBadRequest.class)
	public ResponseEntity<Object> resourceExceptionBadRequest(ResourceExceptionBadRequest ex, WebRequest request) {
		ResponseError response = new ResponseError(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
		logger.info(ex.getMessage());
		ex.printStackTrace();
		return handleExceptionInternal(ex, response, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Object> constraintViolationException(DataIntegrityViolationException ex, WebRequest request){
		ResponseError response = new ResponseError("Chave duplicada, verifique o campo [numeroConta]", HttpStatus.CONFLICT.value());
		logger.info(ex.getMessage());
		ex.printStackTrace();
		return handleExceptionInternal(ex, response, new HttpHeaders(), HttpStatus.CONFLICT, request);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		ResponseError response = new ResponseError("Verifique os campos", HttpStatus.BAD_REQUEST.value());
		
		List<String> erros = ex.getBindingResult().getFieldErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.toList());
		response.setErros(erros);
		
		return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	

	

	

	
}
