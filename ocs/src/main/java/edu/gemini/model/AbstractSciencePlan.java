package edu.gemini.model;

public abstract class AbstractSciencePlan {
    /**
     * This is the enum indicating the status of a science plan
     * <ul>
     * <li>COMPLETE = The plan finishes running</li>
     * <li>TESTED = The plan finished testing</li>
     * <li>CANCELLED = The plan has been canceled</li>
     * <li>RUNNING = The plan is being run in edu.gemini.OCS</li>
     * <li>SUBMITTED = The plan has been submitted to edu.gemini.OCS</li>
     * <li>VALIDATED = The plan has been validated by the science observer</li>
     * <li>INVALIDATED = The plan has been rejected by the science observer</li>
     * </ul>
     *
     * The flows can be as follows.
     * <ul>
     * <li>FLOW1: SUBMITTED (Astronomer) > ** TESTED (Astronomer) >
     * ** VALIDATED/INVALIDATED (Science Observer) > ** RUNNING (edu.gemini.OCS) > COMPLETE (edu.gemini.OCS) > *** </li>
     * <li>FLOW2: SUBMITTED (Astronomer) > CANCELLED (Astronomer) > ***</li>
     * </ul>
     */
    public enum STATUS {
        /**
         * SAVED = The plan is saved
         */
        SAVED,
        /**
         * COMPLETE = The plan finishes running
         */
        COMPLETE,
        /**
         * TESTED = The plan finished testing
         */
        TESTED,
        /**
         * CANCELLED = The plan has been canceled
         */
        CANCELLED,
        /**
         * RUNNING = The plan is being run in edu.gemini.OCS
         */
        RUNNING,
        /**
         * SUBMITTED = The plan has been submitted to edu.gemini.OCS
         */
        SUBMITTED,
        /**
         * VALIDATED = The plan has been validated by the science observer
         */
        VALIDATED,
        /**
         * INVALIDATED = The plan has been rejected by the science observer
         */
        INVALIDATED
    }
}
