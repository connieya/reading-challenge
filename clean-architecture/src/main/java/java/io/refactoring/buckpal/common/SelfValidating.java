package java.io.refactoring.buckpal.common;

import jakarta.validation.*;

import java.util.Set;

public abstract class SelfValidating<T> {
    private Validator validator;

    public SelfValidating() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    protected void validationSelf() {
        Set<ConstraintViolation<T>> violations = validator.validate((T) this);
        if (!violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
    }
}
