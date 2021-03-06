package br.com.senior.employee.consumer.pojos;

import java.util.List;

/**
 * Motivo de licença.
 */
public class ReasonLeave {

    public static class Id {

        public String id;

        public Id() {
        }

        public Id(String reasonLeaveId) {
            this.id = reasonLeaveId;
        }

        public String getReasonLeaveId() {
            return id;
        }

        public String getId() {
            return id;
        }

    }

    public static class PagedResults {
        public Long totalPages;
        public Long totalElements;

        public List<ReasonLeave> contents;

        public PagedResults() {
        }

        public PagedResults(List<ReasonLeave> contents) {
            this.contents = contents;
        }

        public PagedResults(List<ReasonLeave> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }

    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;

        public PageRequest() {
        }

        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }

        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }

        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
        }

        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
            this.offset = offset;
            this.size = size;
            this.orderBy = orderBy;
            this.filter = filter;
            this.displayFields = displayFields;
        }
    }

    /**
     * Id interno da entidade.
     */
    public String id;
    /**
     * Código do motivo.
     */
    public Long code;
    /**
     * Nome do motivo.
     */
    public String name;

    public ReasonLeave() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ReasonLeave(String id, Long code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ReasonLeave(Long code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int ret = 1;
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        return ret;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReasonLeave)) {
            return false;
        }
        ReasonLeave other = (ReasonLeave) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append(" [");
        sb.append("id=").append(id == null ? "null" : id).append(", ");
        sb.append("code=").append(code == null ? "null" : code).append(", ");
        sb.append("name=").append(name == null ? "null" : name);
        sb.append(']');
        return sb.toString();
    }

}
