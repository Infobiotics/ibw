# This Makefile is part of the NUPACK software suite
# Copyright (c) 2007 Caltech. All rights reserved.
# Coded by: Justin Bois 1/2007

# Makefile for making all of NUPACK
#
# Right now only the thermo directory is made.  Design, kinetics,
# and other directories may be added as the code is developed.

# ########################################################
# This Makefile is for just compiling the thermo stuff. 
# NOT FOR USE IN FULL NUPACK DISTRIBUTION!!!!
# ########################################################

# Set up some default
ifndef CC
  CC=gcc
endif

ifndef NUPACK_CFLAGS
  NUPACK_CFLAGS=-O3 -Wall -Wmissing-prototypes -Wmissing-declarations
endif

ifndef NUPACK_LIBS
  NUPACK_LIBS=-lptmalloc3 -lpthread
endif


MKL_LIBS=
ifdef USE_MKL
ifndef MKL_HOME
  MKL_HOME=$(HOME)/intel/mkl/10.0.1.014
endif
MKL_LIBS=-L$(MKL_HOME)/lib -lmkl -lguide -lpthread
MKL_INCLUDES=-I$(MKL_HOME)/include
endif

export CC
export NUPACK_CFLAGS
export NUPACK_LIBS
export MKL_HOME
export MKL_LIBS

MALLOC_LIB=../../lib/libptmalloc3.a

# Targets
all: $(MALLOC_LIB) subdirs

# S
SUBDIRS = ../shared/rng ../shared utils  complexes \
	  distributions concentrations  \
	  basics

$(MALLOC_LIB):
	$(MAKE) -C ../ptmalloc3
	cp -f ../ptmalloc3/libptmalloc3.a ../../lib

.PHONY: subdirs $(SUBDIRS)
               
subdirs: $(SUBDIRS)
                         
$(SUBDIRS):
	$(MAKE) -C $@ 

clean: 
	$(MAKE) -C ../../lib clean
	$(MAKE) -C ../ptmalloc3 clean
	$(MAKE) -C ../shared clean
	$(MAKE) -C utils clean
	$(MAKE) -C basics clean
	$(MAKE) -C complexes clean
	$(MAKE) -C distributions clean
	$(MAKE) -C concentrations clean

