/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.uach.sqlmigrationhibernate.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eopg9
 */
@Entity
@Table(name = "ALL_ALL_TABLES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllAllTables.findAll", query = "SELECT a FROM AllAllTables a"),
    @NamedQuery(name = "AllAllTables.findByOwner", query = "SELECT a FROM AllAllTables a WHERE a.owner = :owner"),
    @NamedQuery(name = "AllAllTables.findByTableName", query = "SELECT a FROM AllAllTables a WHERE a.tableName = :tableName"),
    @NamedQuery(name = "AllAllTables.findByTablespaceName", query = "SELECT a FROM AllAllTables a WHERE a.tablespaceName = :tablespaceName"),
    @NamedQuery(name = "AllAllTables.findByClusterName", query = "SELECT a FROM AllAllTables a WHERE a.clusterName = :clusterName"),
    @NamedQuery(name = "AllAllTables.findByIotName", query = "SELECT a FROM AllAllTables a WHERE a.iotName = :iotName"),
    @NamedQuery(name = "AllAllTables.findByStatus", query = "SELECT a FROM AllAllTables a WHERE a.status = :status"),
    @NamedQuery(name = "AllAllTables.findByPctFree", query = "SELECT a FROM AllAllTables a WHERE a.pctFree = :pctFree"),
    @NamedQuery(name = "AllAllTables.findByPctUsed", query = "SELECT a FROM AllAllTables a WHERE a.pctUsed = :pctUsed"),
    @NamedQuery(name = "AllAllTables.findByIniTrans", query = "SELECT a FROM AllAllTables a WHERE a.iniTrans = :iniTrans"),
    @NamedQuery(name = "AllAllTables.findByMaxTrans", query = "SELECT a FROM AllAllTables a WHERE a.maxTrans = :maxTrans"),
    @NamedQuery(name = "AllAllTables.findByInitialExtent", query = "SELECT a FROM AllAllTables a WHERE a.initialExtent = :initialExtent"),
    @NamedQuery(name = "AllAllTables.findByNextExtent", query = "SELECT a FROM AllAllTables a WHERE a.nextExtent = :nextExtent"),
    @NamedQuery(name = "AllAllTables.findByMinExtents", query = "SELECT a FROM AllAllTables a WHERE a.minExtents = :minExtents"),
    @NamedQuery(name = "AllAllTables.findByMaxExtents", query = "SELECT a FROM AllAllTables a WHERE a.maxExtents = :maxExtents"),
    @NamedQuery(name = "AllAllTables.findByPctIncrease", query = "SELECT a FROM AllAllTables a WHERE a.pctIncrease = :pctIncrease"),
    @NamedQuery(name = "AllAllTables.findByFreelists", query = "SELECT a FROM AllAllTables a WHERE a.freelists = :freelists"),
    @NamedQuery(name = "AllAllTables.findByFreelistGroups", query = "SELECT a FROM AllAllTables a WHERE a.freelistGroups = :freelistGroups"),
    @NamedQuery(name = "AllAllTables.findByLogging", query = "SELECT a FROM AllAllTables a WHERE a.logging = :logging"),
    @NamedQuery(name = "AllAllTables.findByBackedUp", query = "SELECT a FROM AllAllTables a WHERE a.backedUp = :backedUp"),
    @NamedQuery(name = "AllAllTables.findByNumRows", query = "SELECT a FROM AllAllTables a WHERE a.numRows = :numRows"),
    @NamedQuery(name = "AllAllTables.findByBlocks", query = "SELECT a FROM AllAllTables a WHERE a.blocks = :blocks"),
    @NamedQuery(name = "AllAllTables.findByEmptyBlocks", query = "SELECT a FROM AllAllTables a WHERE a.emptyBlocks = :emptyBlocks"),
    @NamedQuery(name = "AllAllTables.findByAvgSpace", query = "SELECT a FROM AllAllTables a WHERE a.avgSpace = :avgSpace"),
    @NamedQuery(name = "AllAllTables.findByChainCnt", query = "SELECT a FROM AllAllTables a WHERE a.chainCnt = :chainCnt"),
    @NamedQuery(name = "AllAllTables.findByAvgRowLen", query = "SELECT a FROM AllAllTables a WHERE a.avgRowLen = :avgRowLen"),
    @NamedQuery(name = "AllAllTables.findByAvgSpaceFreelistBlocks", query = "SELECT a FROM AllAllTables a WHERE a.avgSpaceFreelistBlocks = :avgSpaceFreelistBlocks"),
    @NamedQuery(name = "AllAllTables.findByNumFreelistBlocks", query = "SELECT a FROM AllAllTables a WHERE a.numFreelistBlocks = :numFreelistBlocks"),
    @NamedQuery(name = "AllAllTables.findByDegree", query = "SELECT a FROM AllAllTables a WHERE a.degree = :degree"),
    @NamedQuery(name = "AllAllTables.findByInstances", query = "SELECT a FROM AllAllTables a WHERE a.instances = :instances"),
    @NamedQuery(name = "AllAllTables.findByCache", query = "SELECT a FROM AllAllTables a WHERE a.cache = :cache"),
    @NamedQuery(name = "AllAllTables.findByTableLock", query = "SELECT a FROM AllAllTables a WHERE a.tableLock = :tableLock"),
    @NamedQuery(name = "AllAllTables.findBySampleSize", query = "SELECT a FROM AllAllTables a WHERE a.sampleSize = :sampleSize"),
    @NamedQuery(name = "AllAllTables.findByLastAnalyzed", query = "SELECT a FROM AllAllTables a WHERE a.lastAnalyzed = :lastAnalyzed"),
    @NamedQuery(name = "AllAllTables.findByPartitioned", query = "SELECT a FROM AllAllTables a WHERE a.partitioned = :partitioned"),
    @NamedQuery(name = "AllAllTables.findByIotType", query = "SELECT a FROM AllAllTables a WHERE a.iotType = :iotType"),
    @NamedQuery(name = "AllAllTables.findByObjectIdType", query = "SELECT a FROM AllAllTables a WHERE a.objectIdType = :objectIdType"),
    @NamedQuery(name = "AllAllTables.findByTableTypeOwner", query = "SELECT a FROM AllAllTables a WHERE a.tableTypeOwner = :tableTypeOwner"),
    @NamedQuery(name = "AllAllTables.findByTableType", query = "SELECT a FROM AllAllTables a WHERE a.tableType = :tableType"),
    @NamedQuery(name = "AllAllTables.findByTemporary", query = "SELECT a FROM AllAllTables a WHERE a.temporary = :temporary"),
    @NamedQuery(name = "AllAllTables.findBySecondary", query = "SELECT a FROM AllAllTables a WHERE a.secondary = :secondary"),
    @NamedQuery(name = "AllAllTables.findByNested", query = "SELECT a FROM AllAllTables a WHERE a.nested = :nested"),
    @NamedQuery(name = "AllAllTables.findByBufferPool", query = "SELECT a FROM AllAllTables a WHERE a.bufferPool = :bufferPool"),
    @NamedQuery(name = "AllAllTables.findByFlashCache", query = "SELECT a FROM AllAllTables a WHERE a.flashCache = :flashCache"),
    @NamedQuery(name = "AllAllTables.findByCellFlashCache", query = "SELECT a FROM AllAllTables a WHERE a.cellFlashCache = :cellFlashCache"),
    @NamedQuery(name = "AllAllTables.findByRowMovement", query = "SELECT a FROM AllAllTables a WHERE a.rowMovement = :rowMovement"),
    @NamedQuery(name = "AllAllTables.findByGlobalStats", query = "SELECT a FROM AllAllTables a WHERE a.globalStats = :globalStats"),
    @NamedQuery(name = "AllAllTables.findByUserStats", query = "SELECT a FROM AllAllTables a WHERE a.userStats = :userStats"),
    @NamedQuery(name = "AllAllTables.findByDuration", query = "SELECT a FROM AllAllTables a WHERE a.duration = :duration"),
    @NamedQuery(name = "AllAllTables.findBySkipCorrupt", query = "SELECT a FROM AllAllTables a WHERE a.skipCorrupt = :skipCorrupt"),
    @NamedQuery(name = "AllAllTables.findByMonitoring", query = "SELECT a FROM AllAllTables a WHERE a.monitoring = :monitoring"),
    @NamedQuery(name = "AllAllTables.findByClusterOwner", query = "SELECT a FROM AllAllTables a WHERE a.clusterOwner = :clusterOwner"),
    @NamedQuery(name = "AllAllTables.findByDependencies", query = "SELECT a FROM AllAllTables a WHERE a.dependencies = :dependencies"),
    @NamedQuery(name = "AllAllTables.findByCompression", query = "SELECT a FROM AllAllTables a WHERE a.compression = :compression"),
    @NamedQuery(name = "AllAllTables.findByCompressFor", query = "SELECT a FROM AllAllTables a WHERE a.compressFor = :compressFor"),
    @NamedQuery(name = "AllAllTables.findByDropped", query = "SELECT a FROM AllAllTables a WHERE a.dropped = :dropped"),
    @NamedQuery(name = "AllAllTables.findBySegmentCreated", query = "SELECT a FROM AllAllTables a WHERE a.segmentCreated = :segmentCreated")})
public class AllAllTables implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "OWNER")
    private String owner;
    @Column(name = "TABLE_NAME")
    @Id
    private String tableName;
    @Column(name = "TABLESPACE_NAME")
    private String tablespaceName;
    @Column(name = "CLUSTER_NAME")
    private String clusterName;
    @Column(name = "IOT_NAME")
    private String iotName;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "PCT_FREE")
    private BigInteger pctFree;
    @Column(name = "PCT_USED")
    private BigInteger pctUsed;
    @Column(name = "INI_TRANS")
    private BigInteger iniTrans;
    @Column(name = "MAX_TRANS")
    private BigInteger maxTrans;
    @Column(name = "INITIAL_EXTENT")
    private BigInteger initialExtent;
    @Column(name = "NEXT_EXTENT")
    private BigInteger nextExtent;
    @Column(name = "MIN_EXTENTS")
    private BigInteger minExtents;
    @Column(name = "MAX_EXTENTS")
    private BigInteger maxExtents;
    @Column(name = "PCT_INCREASE")
    private BigInteger pctIncrease;
    @Column(name = "FREELISTS")
    private BigInteger freelists;
    @Column(name = "FREELIST_GROUPS")
    private BigInteger freelistGroups;
    @Column(name = "LOGGING")
    private String logging;
    @Column(name = "BACKED_UP")
    private String backedUp;
    @Column(name = "NUM_ROWS")
    private BigInteger numRows;
    @Column(name = "BLOCKS")
    private BigInteger blocks;
    @Column(name = "EMPTY_BLOCKS")
    private BigInteger emptyBlocks;
    @Column(name = "AVG_SPACE")
    private BigInteger avgSpace;
    @Column(name = "CHAIN_CNT")
    private BigInteger chainCnt;
    @Column(name = "AVG_ROW_LEN")
    private BigInteger avgRowLen;
    @Column(name = "AVG_SPACE_FREELIST_BLOCKS")
    private BigInteger avgSpaceFreelistBlocks;
    @Column(name = "NUM_FREELIST_BLOCKS")
    private BigInteger numFreelistBlocks;
    @Column(name = "DEGREE")
    private String degree;
    @Column(name = "INSTANCES")
    private String instances;
    @Column(name = "CACHE")
    private String cache;
    @Column(name = "TABLE_LOCK")
    private String tableLock;
    @Column(name = "SAMPLE_SIZE")
    private BigInteger sampleSize;
    @Column(name = "LAST_ANALYZED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAnalyzed;
    @Column(name = "PARTITIONED")
    private String partitioned;
    @Column(name = "IOT_TYPE")
    private String iotType;
    @Column(name = "OBJECT_ID_TYPE")
    private String objectIdType;
    @Column(name = "TABLE_TYPE_OWNER")
    private String tableTypeOwner;
    @Column(name = "TABLE_TYPE")
    private String tableType;
    @Column(name = "TEMPORARY")
    private String temporary;
    @Column(name = "SECONDARY")
    private String secondary;
    @Column(name = "NESTED")
    private String nested;
    @Column(name = "BUFFER_POOL")
    private String bufferPool;
    @Column(name = "FLASH_CACHE")
    private String flashCache;
    @Column(name = "CELL_FLASH_CACHE")
    private String cellFlashCache;
    @Column(name = "ROW_MOVEMENT")
    private String rowMovement;
    @Column(name = "GLOBAL_STATS")
    private String globalStats;
    @Column(name = "USER_STATS")
    private String userStats;
    @Column(name = "DURATION")
    private String duration;
    @Column(name = "SKIP_CORRUPT")
    private String skipCorrupt;
    @Column(name = "MONITORING")
    private String monitoring;
    @Column(name = "CLUSTER_OWNER")
    private String clusterOwner;
    @Column(name = "DEPENDENCIES")
    private String dependencies;
    @Column(name = "COMPRESSION")
    private String compression;
    @Column(name = "COMPRESS_FOR")
    private String compressFor;
    @Column(name = "DROPPED")
    private String dropped;
    @Column(name = "SEGMENT_CREATED")
    private String segmentCreated;


    public AllAllTables() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getIotName() {
        return iotName;
    }

    public void setIotName(String iotName) {
        this.iotName = iotName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getPctFree() {
        return pctFree;
    }

    public void setPctFree(BigInteger pctFree) {
        this.pctFree = pctFree;
    }

    public BigInteger getPctUsed() {
        return pctUsed;
    }

    public void setPctUsed(BigInteger pctUsed) {
        this.pctUsed = pctUsed;
    }

    public BigInteger getIniTrans() {
        return iniTrans;
    }

    public void setIniTrans(BigInteger iniTrans) {
        this.iniTrans = iniTrans;
    }

    public BigInteger getMaxTrans() {
        return maxTrans;
    }

    public void setMaxTrans(BigInteger maxTrans) {
        this.maxTrans = maxTrans;
    }

    public BigInteger getInitialExtent() {
        return initialExtent;
    }

    public void setInitialExtent(BigInteger initialExtent) {
        this.initialExtent = initialExtent;
    }

    public BigInteger getNextExtent() {
        return nextExtent;
    }

    public void setNextExtent(BigInteger nextExtent) {
        this.nextExtent = nextExtent;
    }

    public BigInteger getMinExtents() {
        return minExtents;
    }

    public void setMinExtents(BigInteger minExtents) {
        this.minExtents = minExtents;
    }

    public BigInteger getMaxExtents() {
        return maxExtents;
    }

    public void setMaxExtents(BigInteger maxExtents) {
        this.maxExtents = maxExtents;
    }

    public BigInteger getPctIncrease() {
        return pctIncrease;
    }

    public void setPctIncrease(BigInteger pctIncrease) {
        this.pctIncrease = pctIncrease;
    }

    public BigInteger getFreelists() {
        return freelists;
    }

    public void setFreelists(BigInteger freelists) {
        this.freelists = freelists;
    }

    public BigInteger getFreelistGroups() {
        return freelistGroups;
    }

    public void setFreelistGroups(BigInteger freelistGroups) {
        this.freelistGroups = freelistGroups;
    }

    public String getLogging() {
        return logging;
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    public String getBackedUp() {
        return backedUp;
    }

    public void setBackedUp(String backedUp) {
        this.backedUp = backedUp;
    }

    public BigInteger getNumRows() {
        return numRows;
    }

    public void setNumRows(BigInteger numRows) {
        this.numRows = numRows;
    }

    public BigInteger getBlocks() {
        return blocks;
    }

    public void setBlocks(BigInteger blocks) {
        this.blocks = blocks;
    }

    public BigInteger getEmptyBlocks() {
        return emptyBlocks;
    }

    public void setEmptyBlocks(BigInteger emptyBlocks) {
        this.emptyBlocks = emptyBlocks;
    }

    public BigInteger getAvgSpace() {
        return avgSpace;
    }

    public void setAvgSpace(BigInteger avgSpace) {
        this.avgSpace = avgSpace;
    }

    public BigInteger getChainCnt() {
        return chainCnt;
    }

    public void setChainCnt(BigInteger chainCnt) {
        this.chainCnt = chainCnt;
    }

    public BigInteger getAvgRowLen() {
        return avgRowLen;
    }

    public void setAvgRowLen(BigInteger avgRowLen) {
        this.avgRowLen = avgRowLen;
    }

    public BigInteger getAvgSpaceFreelistBlocks() {
        return avgSpaceFreelistBlocks;
    }

    public void setAvgSpaceFreelistBlocks(BigInteger avgSpaceFreelistBlocks) {
        this.avgSpaceFreelistBlocks = avgSpaceFreelistBlocks;
    }

    public BigInteger getNumFreelistBlocks() {
        return numFreelistBlocks;
    }

    public void setNumFreelistBlocks(BigInteger numFreelistBlocks) {
        this.numFreelistBlocks = numFreelistBlocks;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getTableLock() {
        return tableLock;
    }

    public void setTableLock(String tableLock) {
        this.tableLock = tableLock;
    }

    public BigInteger getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(BigInteger sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Date getLastAnalyzed() {
        return lastAnalyzed;
    }

    public void setLastAnalyzed(Date lastAnalyzed) {
        this.lastAnalyzed = lastAnalyzed;
    }

    public String getPartitioned() {
        return partitioned;
    }

    public void setPartitioned(String partitioned) {
        this.partitioned = partitioned;
    }

    public String getIotType() {
        return iotType;
    }

    public void setIotType(String iotType) {
        this.iotType = iotType;
    }

    public String getObjectIdType() {
        return objectIdType;
    }

    public void setObjectIdType(String objectIdType) {
        this.objectIdType = objectIdType;
    }

    public String getTableTypeOwner() {
        return tableTypeOwner;
    }

    public void setTableTypeOwner(String tableTypeOwner) {
        this.tableTypeOwner = tableTypeOwner;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getNested() {
        return nested;
    }

    public void setNested(String nested) {
        this.nested = nested;
    }

    public String getBufferPool() {
        return bufferPool;
    }

    public void setBufferPool(String bufferPool) {
        this.bufferPool = bufferPool;
    }

    public String getFlashCache() {
        return flashCache;
    }

    public void setFlashCache(String flashCache) {
        this.flashCache = flashCache;
    }

    public String getCellFlashCache() {
        return cellFlashCache;
    }

    public void setCellFlashCache(String cellFlashCache) {
        this.cellFlashCache = cellFlashCache;
    }

    public String getRowMovement() {
        return rowMovement;
    }

    public void setRowMovement(String rowMovement) {
        this.rowMovement = rowMovement;
    }

    public String getGlobalStats() {
        return globalStats;
    }

    public void setGlobalStats(String globalStats) {
        this.globalStats = globalStats;
    }

    public String getUserStats() {
        return userStats;
    }

    public void setUserStats(String userStats) {
        this.userStats = userStats;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSkipCorrupt() {
        return skipCorrupt;
    }

    public void setSkipCorrupt(String skipCorrupt) {
        this.skipCorrupt = skipCorrupt;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getClusterOwner() {
        return clusterOwner;
    }

    public void setClusterOwner(String clusterOwner) {
        this.clusterOwner = clusterOwner;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }

    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
    }

    public String getCompressFor() {
        return compressFor;
    }

    public void setCompressFor(String compressFor) {
        this.compressFor = compressFor;
    }

    public String getDropped() {
        return dropped;
    }

    public void setDropped(String dropped) {
        this.dropped = dropped;
    }

    public String getSegmentCreated() {
        return segmentCreated;
    }

    public void setSegmentCreated(String segmentCreated) {
        this.segmentCreated = segmentCreated;
    }

    
}
