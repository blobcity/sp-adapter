package com.blobcity.db.sp.triggers;

/**
 * @author sanketsarang
 */
public class TriggerOutcome {
    private final boolean proceed;
    private final String cause;

    /**
     * Creates a default success response for the trigger
     */
    public TriggerOutcome() {
        this.proceed = true;
        this.cause = "";
    }

    public TriggerOutcome(final boolean proceed) {
        this.proceed = proceed;
        this.cause = "";
    }

    public TriggerOutcome(final boolean proceed, final String errorMessage) {
        this.proceed = proceed;
        this.cause = errorMessage;
    }

    public boolean isProceed() {
        return proceed;
    }

    public String getCause() {
        return cause;
    }

    public static final TriggerOutcome proceed() {
        return new TriggerOutcome();
    }

    public static final TriggerOutcome rollback() {
        return new TriggerOutcome(false);
    }

    public static final TriggerOutcome rollback(final String cause) {
        return new TriggerOutcome(false, cause);
    }
}
