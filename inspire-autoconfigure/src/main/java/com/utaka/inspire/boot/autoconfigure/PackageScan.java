/*
 * Copyright (c) 2018. utaka and/or its affiliates.
 */

package com.utaka.inspire.boot.autoconfigure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * 该注解必须放在{@link org.springframework.boot.autoconfigure.SpringBootApplication}之前.
 * <p>
 * Indicates that the package containing the annotated class should be registered with
 * {@link PackageRegistrar}.
 *
 * @see PackageRegistrar
 * @since 1.3.0
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ComponentScan
@Import(PackageRegistrar.class)
public @interface PackageScan {

    /**
     * Base packages to scan for annotated components. Use {@link #basePackageClasses}
     * for a type-safe alternative to String-based package names.
     *
     * @return base packages to scan
     * @since 1.3.0
     */
    @AliasFor(annotation = ComponentScan.class, attribute = "basePackages")
    String[] basePackages() default {};

    /**
     * Type-safe alternative to {@link #basePackages} for specifying the packages to
     * scan for annotated components. The package of each class specified will be scanned.
     * <p>
     * Consider creating a special no-op marker class or interface in each package that
     * serves no purpose other than being referenced by this attribute.
     *
     * @return base packages to scan
     * @since 1.3.0
     */
    @AliasFor(annotation = ComponentScan.class, attribute = "basePackageClasses")
    Class<?>[] basePackageClasses() default {};

}
