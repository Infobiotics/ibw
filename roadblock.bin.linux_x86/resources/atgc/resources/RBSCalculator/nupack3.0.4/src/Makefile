# This Makefile is part of the NUPACK software suite
# Copyright (c) 2007 Caltech. All rights reserved.
# Coded by: Justin Bois 1/2007

# Makefile for making all of NUPACK
#
# Right now only the thermo directory is made.  Design, kinetics,
# and other directories may be added as the code is developed.

# Set up some default

ifndef CC
  CC=icc
endif

ifndef CXX
  CXX=icpc
endif

ifndef NUPACK_CFLAGS
  NUPACK_CFLAGS = -std=c99 -Wall -Wmissing-prototypes -Wmissing-declarations
  export NUPACK_CFLAGS
endif

ifndef NUPACK_CXXFLAGS
  NUPACK_CXXFLAGS = -Wall -Wmissing-prototypes -Wmissing-declarations
  export NUPACK_CXXFLAGS
endif


ifndef NUPACK_LIBS
  NUPACK_LIBS=-lptmalloc3 -lpthread
  export NUPACK_LIBS
endif



SAMPLE_FLAGS=-DNUPACK_SAMPLE
export NUPACK_SAMPLE

NUPACK_SELECTION_FLAGS=${SAMPLE_FLAGS} ${MPI_FLAGS}

export CC
export CXX
export NUPACK_SELECTION_FLAGS
export NUPACK_FLAGS
export NUPACK_LIBS
export OPENMPI

MALLOC_LIB=../lib/libptmalloc3.a

# Targets
.PHONY: all
all: $(MALLOC_LIB) subdirs

# Subdirectories
SUBDIRS = shared/rng shared thermo/utils  thermo/complexes \
	  thermo/distributions thermo/concentrations  \
	  thermo/basics \
	  design/design_pfunc_utils  \
	  design/single-complex \


$(MALLOC_LIB):
	$(MAKE) -C ptmalloc3
	cp -f ptmalloc3/libptmalloc3.a ../lib

.PHONY: subdirs $(SUBDIRS)

subdirs: $(SUBDIRS)

$(SUBDIRS):
	$(MAKE) -C $@

clean:
	$(MAKE) -C ../lib clean
	$(MAKE) -C ptmalloc3 clean
	$(MAKE) -C shared clean
	$(MAKE) -C shared/rng clean
	$(MAKE) -C thermo/utils clean
	$(MAKE) -C thermo/basics clean
	$(MAKE) -C thermo/complexes clean
	$(MAKE) -C thermo/distributions clean
	$(MAKE) -C thermo/concentrations clean
	$(MAKE) -C design/design_pfunc_utils clean
	$(MAKE) -C design/single-complex clean
